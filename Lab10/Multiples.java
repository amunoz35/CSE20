import java.util.Scanner;

public class Multiples{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();

		System.out.print("Enter the Base: ");
		int base = input.nextInt();
		int i;
		for(i = base; i <= max; i += base)
		{

			System.out.println("Number is " + i);
		}
	}
}
