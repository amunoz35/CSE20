import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter any number:");
		int sum = 0;
		int max = input.nextInt();
		int i = 0;
		while ( i <= max) {
			sum += i; 
			i++;
		}
		System.out.println("Average of All is " + (float)(sum)/(max + 1));
	}
}