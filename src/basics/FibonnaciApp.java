package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5, k=0;
		for(int i=0; i<=n; i++) {
			k = k + i;
			}
		System.out.println("Value of numbers added from 1 to n:" + k);
		
		for(int i=0; i<=n; i++) {
		System.out.println("Value of i is " + i + " :" + fibonnaci(i)); }
		
		System.out.println("Factorial value of " + n + " :" + factorial(n)); 
		
	}
	
	public static int fibonnaci(int n) {
		if(n <=1)return n;
		else return (fibonnaci(n-1) + fibonnaci(n-2));
	}
	
	public static int factorial(int n) {
		int j=1;
		if(n == 0) return 1;
		else
		for(int i=1; i <= n; i++) {
			j = j*i;
		}
		System.out.println("Factorial of " + n + " is: " + j);
		return j;
	}
			
}
