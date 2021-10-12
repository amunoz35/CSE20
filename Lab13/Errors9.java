public class Errors9 {

	public static void main(String[] args) {
		double[] inp = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};//missing semicolon and decimal to comma <- remove
		double sum = 0;//switch int to double and initialize the variable
		double square = 0;//create variable for square
		for (int i = 1; i < inp.length; ++i ) {//remove - 1 in inp.length - 1
			
			square = inp[i] * inp[i];//create proper equation for the square
			double squares [] = {square};//declare new array to store results
			
			for(int j = 0; j < squares.length; j++)//create for loop
			{
				sum += squares[j];//create different sum equation
			}
			System.out.println("Squared of index " + i + " is " + square);//switch sum to index, switch inp[i] to square
		}
		System.out.println("Sum of Squares is " + sum);
	}
}
