import java.util.Scanner;
public class Bobcar {
	public static void main (String [] args){

		int typeCar, numDays, member, platPack, baseCost, carCost, discountDays;
		double platCost;
		String carName;
		carName = " ";
		discountDays = 0;
		platPack = 0;
		platCost = 0;


		Scanner input = new Scanner (System.in);

		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");
		System.out.print("Please choose the rental car: ");
		typeCar = input.nextInt();
		if(typeCar < 1 || typeCar > 3){
			System.out.println("Error: please enter a valid number(re-run program)");
		}
		else{
			if (typeCar == 1){
				carCost = 25;
				carName = "Economy";}
			else if (typeCar == 2){
				carCost = 55;
				carName = "Compact";}
			else {
				carCost = 100;
				carName = "Standard";}

			System.out.print("Please enter the number of rental days: ");
			numDays = input.nextInt();

			System.out.print("Club member?: 1 for yes, 0 for no: ");
			member = input.nextInt();
			baseCost = carCost * numDays;

			if (member > 1 || member < 0){
				System.out.println("Error: please enter a valid number(re-run program)");
			}
			else{							
				if(member == 1){
					discountDays = numDays / 5;
					System.out.print("Platinum Executive Package?: 1 for yes, 0 for no: ");
					platPack = input.nextInt();}

				System.out.println("\nBase: " + numDays + " days for a " + carName + " @ $" + carCost +  " per day: \t$" + baseCost);
				if (platPack > 1 || platPack < 0){
					System.out.println("Error: please enter a valid number(re-run program)");
				}
				else{
					if(member == 1){
						System.out.print("Club Member Discount:" );
						System.out.println("\t\t\t\t-$" + carCost * discountDays);}

					if(platPack == 1){
						platCost = baseCost * 0.2;
						System.out.println("Platinum Executive Package: " + "\t\t\t+$ " + (int)platCost);
					}
					System.out.println("\nTotal Estimate for Rental: " + "\t\t\t$ " + (int)(baseCost - (carCost * discountDays) + platCost));
					input.close();
				}
			}
		}
	}
}





