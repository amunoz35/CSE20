import java.util.Scanner;

public class SumAllDo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");
		int sum = 0;
		int max = input.nextInt();
		int i = 0;
		do{
			sum += i; 
			System.out.println("Number " + i);
			i++;}
		while ( i <= max);
		System.out.println("Sum of All is " + sum);
	}
}