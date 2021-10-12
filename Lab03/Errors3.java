import java.util.Scanner;

public class Errors3{//missing curly brace

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);//missing the open/close parenthesis around "system.in"
		int numerator;//int was capitalized
		int denominator;//it was defined as "integer" instead of "int"

		System.out.println("This program divides two numbers.");//both this statement 
		System.out.print("Enter the numerator: ");//and this statement are missing the "out" in the print statement
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		denominator = kbd.nextInt();//denominator was misspelled 

		System.out.print(numerator);//System was lowercase
		System.out.print("/");
		System.out.print(denominator);//System was lowercase and print was uppercase
		System.out.print(" = ");
		System.out.println((double) numerator/denominator);//print was uppercase
	}
}//missing closed curly brace
