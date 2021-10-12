import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");
		int sum = 0;
		int max = input.nextInt();
		int i = 0;
		while ( i <= max) {
			sum += i; 
			System.out.println("Number " + i);
			i++;
		}
		System.out.println("Sum of All is " + sum);
	}
}