public class Example2 {
	public static void main(String[] args) {
		int i, ratio;
		int[] numbers = { 100, 10, 0, 5, 2, 8, 0, 30 };

		i = 0;
		for (i = 0; i < numbers.length - 1; i++) {
			try {
				ratio = numbers[i] / numbers[i + 1];
				System.out.println(numbers[i] + "/" + numbers[i + 1] + "=" + ratio);
			} catch (ArithmeticException ae) {
				System.out.println("Couldn't calculate " +
						numbers[i] + "/" + numbers[i + 1]);
			}

		}
	}
}

/*
 * 
 * Example2.java:13: error: variable i might not have been initialized
 * numbers[i] + "/" + numbers[i + 1]);
 * ^
 * 1 error
 * 
 * 
 * Example2.java:14: error: variable i might not have been initialized
 * numbers[i] + "/" + numbers[i + 1]);
 * ^
 * 1 error
 * 
 * 100/10=10
 * Couldn't calculate 10/0
 *
 * because the second division is 10/0 and it throws ArithmeticException and the
 * try/catch block is not in the right place
 */
