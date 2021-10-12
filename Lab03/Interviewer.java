import java.util.Scanner;
public class Interviewer 
{
	public static void main(String [] args)
	{
	String name;
	Scanner input = new Scanner (System.in);
	System.out.print("What is your name? ");
	name = input.nextLine();
	System.out.print("Their name is ");
	System.out.println(name);
	
	String major;
	System.out.print("What is your major? ");
	major = input.nextLine();
	System.out.print("Their major is ");
	System.out.println(major);
	
	String home;
	System.out.println("Where are you from? ");
	home = input.nextLine();
	System.out.print("They are from ");
	System.out.println(home);
	
	String food;
	System.out.print("What is your favorite food? ");
	food = input.nextLine();
	System.out.print("Their favorite food is ");
	System.out.println(food);
	
	int age;
	System.out.print("How old are you? ");
	age = input.nextInt();
	System.out.print("They are " + age + " years old");
	
	}
}
