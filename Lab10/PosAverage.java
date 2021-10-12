import java.util.Scanner;

public class PosAverage{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int i = 0;
		int sum = 0;
		int avg = 0;
		do {
			System.out.print("Enter " + i + " number: ");
			num = input.nextInt();
			if ( num > 0){
			sum += num;}
			i++;
			
		} while (num > 0);
		avg = sum / (i - 1);
		System.out.print("Average is " + avg);
	}
}
