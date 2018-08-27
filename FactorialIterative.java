public class FactorialIterative implements Factorial{
	
	public int factorial(int n) {
		int temp = n;
		for (int i = n-1; i > 0; i--) {
			temp = temp *i;
		}
		return temp;
	}
}