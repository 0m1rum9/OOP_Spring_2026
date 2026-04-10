public class Example1 {
	public static void main(String[] args) {
		int denominator, numerator, ratio;

		numerator = 5;
		denominator = 0;
		try {
			ratio = numerator / denominator;
			System.out.println("The answer is: " + ratio);
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0.");
			e.printStackTrace();
		}


		System.out.println("Done."); // Don't move this line
	}
}

/*
 * Task 1
 * The output was
 * {
 * The answer is: 2
 * Done.
 * }
 * 
 * Yes, the "error" was generated when I executed it
 * 
 * 
 * The error was generated at the run-time, since it was nothing to do with the
 * syntax errors.
 
 * Example1.java:13: error: variable ratio might not have been initialized
 * System.out.println("The answer is: " + ratio);
 * ^
 * 1 error
 *
	Divide by 0.
	Done.


	Divide by 0.
	java.lang.ArithmeticException: / by zero
		at Example1.main(Example1.java:8)
	Done.


	Yes it executed properly
 * 
 */
