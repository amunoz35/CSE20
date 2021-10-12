import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int number = 0;
		int theSquare = 0;

		System.out.print("Enter a number and I will ");//it was missing a semicolon
		System.out.print("square it for you:  ");//it was missing a closing quotation mark
		number =  kbd.nextInt();
		//the number is being assigned to "keyboard" instead of "kbd" which is defined and it was missing the open/close parenthesis

		theSquare = number * number;/*not only was the statement in a comment, but "theSquare" 
		 							was completely lowercase and hard to read*/
		System.out.print(number + " squared = ");//missing the close parenthesis
		System.out.println(theSquare);//this statement was in quotation marks and printed as a normal statement instead of the variable
	}
}