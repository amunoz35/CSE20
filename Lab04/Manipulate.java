import java.util.Scanner;
public class Manipulate
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner (System.in);
		int n1, n2;
		System.out.println("Please enter an integer:");
		n1 = scan.nextInt();
		System.out.println("Please enter another integer:");
		n2 = scan.nextInt();
		System.out.println("Sum of n1 and n2 is: " + (int)(n1 + n2));
		System.out.println("Difference of n1 and n2 is: " + (int)(n1 - n2));
		System.out.println("Quotient of n1 and n2 is: " + (int)(n1 / n2));
		System.out.println("Product of n1 and n2 is: " + (int)(n1 * n2));
		System.out.println("Remainder of n1 and n2 is: " + (int)(n1 % n2));
		
		
		short short1, short2;
		System.out.println("What is your short value?: ");
		short1 = scan.nextShort();
		System.out.println("What is your second short value?: ");
		short2 = scan.nextShort();
		
		System.out.println("Sum of short1 and short2 is: " + (short)(short1 + short2));
		System.out.println("Difference of short1 and short2 is: " + (short)(short1 - short2));
		System.out.println("Quotient of short1 and short2 is: " + (short)(short1 / short2));
		System.out.println("Product of short1 and short2 is: " + (short)(short1 * short2));
		System.out.println("Remainder of short1 and short2 is: " + (short)(short1 % short2));
		
		float float1, float2;
		System.out.println("\nWhat is your float value?: ");
		float1 = scan.nextFloat();
		System.out.println("What is your second float value?: ");
		float2 = scan.nextFloat();
		
		System.out.println("Sum of float1 and float2 is: " + (float)(float1 + float2));
		System.out.println("Difference of float1 and float2 is: " + (float)(float1 - float2));
		System.out.println("Quotient of float1 and float2 is: " + (float)(float1 / float2));
		System.out.println("Product of float1 and float2 is: " + (float)(float1 * float2));
		System.out.println("Remainder of float1 and float2 is: " + (float)(float1 % float2));
		
		double doub1, doub2;
		System.out.println("\nWhat is your double value?: ");
		doub1 = scan.nextDouble();
		System.out.println("What is your second double value?: ");
		doub2 = scan.nextDouble();
		
		System.out.println("Sum of double1 and double2 is: " + (double)(doub1 + doub2));
		System.out.println("Difference of double1 and double2 is: " + (double)(doub1 - doub2));
		System.out.println("Quotient of double1 and double2 is: " + (double)(doub1 / doub2));
		System.out.println("Product of double1 and double2 is: " + (double)(doub1 * doub2));
		System.out.println("Remainder of double1 and double2 is: " + (double)(doub1 % doub2));
		
	}
	
}
