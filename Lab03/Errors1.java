import java.util.Scanner;
//added the scanner
public class Errors1 {

	public static void main(String[] args) {
		System.out.println("Can you spot and fix the errors?"); 
				//the old print statement had missing "".

		System.out.print("Enter two numbers and I ");
		System.out.println("add them for you");
		//I removed "ln" on the first statement to make the following line of code print on the same line

		int n1, n2;

		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		/*the two lines above had the errors in that
		 * they were missing the name of the scanner in front of the "nextInt()"
		 The second line also had int lowercased instead of uppercase*/

		System.out.println("The sum of the numbers is");
		//added "out" in the print statement
		System.out.println(n1 + n2);
		//the print statement was subtracting prior to the revision
	}
}