import java.util.Scanner;

public class SumAllFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");
		int sum = 0;
		int max = input.nextInt();
		int i;
		for (i = 0;  i <= max; ++i) {
			sum += i; 
			System.out.println("Number " + i);
		}
		System.out.println("Sum of All is " + sum);
	}
}