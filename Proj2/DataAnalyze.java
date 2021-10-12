import java.util.*;
public class DataAnalyze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		int[] sum = {0,0,0,0};
		int[] avg = {0, 0, 0, 0,};
		System.out.print("Please enter the sample size:");
		size = input.nextInt();
		System.out.println("Enter numbers for Trial 0");
		int[] zero = new int[size];

		for(int i = 0; i < size; i++){
			System.out.print("Enter sample #" + i +":");
			zero[i] = input.nextInt();
			sum[0] += zero[i];
		}
		avg[0] = sum[0]/ size;
		System.out.println("\nEnter numbers for Trial 1");
		int[] one = new int[size];

		for(int i = 0; i < size; i++){
			System.out.print("Enter sample #" + i +":");
			one[i] = input.nextInt();
			sum[1] += one[i];
		}
		avg[1] = sum[1]/ size;
		System.out.println("\nEnter numbers for Trial 2");
		int[] two = new int[size];

		for(int i = 0; i < size; i++){
			System.out.print("Enter sample #" + i +":");
			two[i] = input.nextInt();
			sum[2] += two[i];
		}
		System.out.println("\nEnter numbers for Trial 3");
		avg[2] = sum[2]/ size;
		int[] three = new int[size];

		for(int i = 0; i < size; i++){
			System.out.print("Enter sample #" + i +":");
			three[i] = input.nextInt();
			sum[3] += three[i];
		}
		avg[3] = sum[3]/ size;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < sum.length; i++) {
			if (min > avg[i]) {
				min = avg[i];
			}

			if (max < avg[i]) {
				max = avg[i];
			}

		}
		System.out.println();
		System.out.print("\tSample #");
		System.out.print("Trial 0\t");
		System.out.print("Trial 1\t");
		System.out.print("Trial 2\t");
		System.out.println("Trial 3\t");
		for(int i = 0; i < size; i++){
			System.out.print("\t" + i);
			System.out.print("\t" + zero[i]);
			System.out.print("\t" + one[i]);
			System.out.print("\t" + two[i]);
			System.out.println("\t" + three[i]);
		}
		System.out.println("\t---------------------------------------");
		System.out.print("Average:");
		int z = 0;
		while(z < 4){
			System.out.print("\t" + avg[z]);
			z++;
		}
		System.out.println("");
		System.out.println("Min Average: " + min);
		System.out.println("Max Average: " + max);
		System.out.println("");
		int m = (min*2);
		if(min == max)
			System.out.println("The trials match EXACTLY!");
		else if(m > max)
			System.out.println("The trials concur with each other!");
		if(min < max)
			System.out.println("The trials do NOT concur!");
		
	}
}


