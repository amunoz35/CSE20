import java.util.Scanner;
public class Interviewer 
{
	public static void main(String [] args)
	{
	String name;
	Scanner input = new Scanner (System.in);
	System.out.print("What is your name? ");
	name = input.nextLine();
	
	String major;
	System.out.print("What is your major? ");
	major = input.nextLine();

	
	String home;
	System.out.println("Where are you from? ");
	home = input.nextLine();
	
	String food;
	System.out.print("What is your favorite food? ");
	food = input.nextLine();
	
	int age;
	System.out.println("How old are you? ");
	age = input.nextInt();
	
	int weight;
	System.out.println("How much do you weigh in pounds? ");
	weight = input.nextInt();
	
	
	
	
	
	System.out.print("Their name is ");
	System.out.println(name);
	System.out.print("Their major is ");
	System.out.println(major);
	System.out.print("They are from ");
	System.out.println(home);
	System.out.print("Their favorite food is ");
	System.out.println(food);
	System.out.println("They are " + age + " years old");
	System.out.println("They weigh " + weight + "lbs.");
	System.out.println("In kilograms, they weigh " + (weight / 2.2) + "kg");
	}
}
