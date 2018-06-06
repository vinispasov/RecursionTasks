import java.util.Scanner;
import java.math.BigInteger;
public class Factoriel {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		BigInteger n=BigInteger.valueOf(input);
		
		System.out.println(factoriel(n));
	}
	
	static BigInteger factoriel(BigInteger n) {
		 if (n.equals(BigInteger.ONE)) {
				return BigInteger.ONE;
			}
		return n.multiply(factoriel(n.subtract(BigInteger.ONE)));
	}

}
