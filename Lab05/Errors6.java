import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.print("Please enter the first number:");
		n1 = input.nextInt();

		System.out.print("Please enter the second number:");
		n2 = input.nextInt();

		int average;
		average = (n1+n2)/2;
		System.out.println("The average of the numbers is " + average);//next line prints on a new line

		Scanner input2 = new Scanner(System.in);

		float f1, f2;//variable names have to be changed

		System.out.print("Please enter the first number:"); 
		f1 = input2.nextFloat();

		System.out.print("Please enter the second number:");
		f2 = input2.nextFloat();

		float average2;//create new variable
		average2 = (f1+f2)/2;
		System.out.println("The average of the numbers is " + average2);//next line prints on a new line

		short s1, s2;

		System.out.println("Please enter the first number:");
		s1 = input.nextShort();

		System.out.print("Please enter the second number:");
		s2 = input.nextShort();
		short shortAvg;
		
		shortAvg = (short)((s1+s2)/2);//wrong variables, cast the entire equation
		System.out.println("The average of the numbers is " + shortAvg);
	}

}
