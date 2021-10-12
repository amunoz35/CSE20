import java.util.*;
public class AnyAverage {

	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.println("This program will find the average of any numbers");
		System.out.print("Please choose amount of numbers to average : ");

		int max = input.nextInt();
		int[] arr1 = new int [max + 1];
		int i = 0;

		int total = 0;
		int div = 0;

		for (i = 0; i < max; i++){
			System.out.print("Please enter " + i + " number: ");
			arr1[i] = input.nextInt();
			total += arr1[i];
			div = i;
		}
		System.out.println("The numbers being averaged: " );
		for (i = 0; i < max; i++)
			if((i + 1) % 5 == 0)
				System.out.println(arr1[i] + " ");
			else
				System.out.print(arr1[i] + " ");


		System.out.println("\nAverage is: " + total / (div + 1));
	}

}


