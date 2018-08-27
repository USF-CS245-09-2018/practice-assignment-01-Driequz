public class FibonacciIterative implements Fibonacci{
	
	public int fibonacci(int n) {
		if(n == 0 || n == 1)
			return n;
		else {
			int cur = 1;
			int prev = 1;
			
			for (int i = 2; i< n; i++) {
				int temporary = cur;
				cur += prev;
				prev = temporary;
			}
			return cur;
		}
}
}