import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int square = 0;
		int sum = 0;
		for (int i = 0; i <= max; i++) {
			square = i * i;
			System.out.println("Number " + i + " squared is " + square);
			sum += square;
		}
		System.out.println("Sum of squares is " + sum);
	}
}
