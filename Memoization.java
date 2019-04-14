
public class Memoization {
	
	public static int memo[] = new int[200];
	
	public static void main(String[] args) {
		System.out.println("Computing 10!");
		long startFactorial = System.nanoTime();
		System.out.println(factorial(10));
		long endFactorial = System.nanoTime();
		System.out.println("10! took: " + (endFactorial - startFactorial) + " nanoseconds");
		System.out.println("Computing 15!");
		long startFactorial2 = System.nanoTime();
		System.out.println(factorial(15));
		long endFactorial2 = System.nanoTime();
		System.out.println("15! took: " + (endFactorial2 - startFactorial2) + " nanoseconds using memoization");
	}
	
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		}else{
			memo[n] = n * factorial(n -1);
		}
		return memo[n];
	}
}