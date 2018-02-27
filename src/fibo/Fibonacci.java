package fibo;


import java.util.Scanner;


/**
 * The Class Fibonacci.
 * @author Johnny
 */
class Fibonacci {

	private Fibonacci() {
		throw new IllegalAccessError("Fibonacci Class");
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws Throwable 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Throwable {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number to limit the Fiboracci Series!"); // NOSONAR
		
		int number = input.nextInt();
		
	    System.out.println(" ");//NOSONAR
	    
	    //System.out.println("Here is some random stuff to show it works!");//NOSONAR

		int[] series = generateSeries(number);

		for (int i = 0; i < series.length; i++) {
			
	
			System.out.println(series[i] + " "); //NOSONAR
		}



	}



	

	/**
	 * Generate series.
	 *
	 * @param number
	 *            the number
	 * @return the int[]
	 */
	
	
	public static int[] generateSeries(int number) {
		if (number == 1) {
			return new int[] { 0 };
		} else if (number == 2) {
			return new int[] { 0, 1 };
		}

		int[] series = new int[number];

		int a = 0;

		int b = 1;
		series[0] = 0;
		series[1] = 1; //made 3 to fail unit test should be 1

		for (int i = 2; i < number; i++) {
			int c;
			c = a + b;
			a = b;
			b = c;
			series[i] = c;
		}

		return series;
	}
}
