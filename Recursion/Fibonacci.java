package Recursion;

public class Fibonacci {
	public static void main(String args[]) {
		System.out.print(Fibonacci(5));
		
	}
	public static  int Fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
		return 1;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
	}
}
