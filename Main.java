import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
		byte result = 0;
		int[] squares = new int[4];
        for (int i = 0; i < 4; i++)
			squares[i] = in.nextInt();
		// Сортируем массив по возрастанию, чтобы упростить проверку элементов
			Arrays.sort(squares);
		
		// Можно ли вообще сложить прямоугольники		
		if (!(squares[0] != squares[1] && squares[1] != squares[2] && squares[2] != squares[3])){
			
			// Проверка двух квадратов
			if (squares[0] == squares[1])
				result++;
			if (squares[1] == squares[2] && squares[0] != squares[1])
				result++;
			if (squares[2] == squares[3] && squares[1] != squares[2])
				result++;
			
			// Проверка трех квадратов
			if (squares[0] == squares[1] && squares[1] == squares[2])
				result++;
			if (squares[1] == squares[2] && squares[2] == squares[3] && squares[0] != squares[1])
				result++;
			
			if (squares[0] == squares[1] && (squares[0]*2 == squares[2] || squares[0]*2 == squares[3]))
				result++;
			if (squares[1] == squares[2] && squares[0] != squares[1] && squares[1]*2 == squares[3])
				result++;
			
			// Проверка четырех квадратов
			if (squares[0] == squares[1] && squares[1] == squares[2]){
				if (squares[2] == squares[3])
					result++;
				if (squares[0]*3 == squares[3])
					result++;
			}
		}
		out.println(result);
    }
}