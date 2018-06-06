import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		System.out.println(findFibonacciNumber(n));
	}
	
	static int findFibonacciNumber(int n) {
		
		if (n==0) {
			return 0;
		}
		if (n<=2) {
			return 1;
		}
		
		return findFibonacciNumber(n-1)+findFibonacciNumber(n-2);
	}

}
