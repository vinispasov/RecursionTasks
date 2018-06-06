import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
public class CorrectBrackets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		String expression="";
		
	  HashSet<String> brackets=combinationOfBrackets(expression,n);
	  
	  for (String bracket : brackets) {
		System.out.println(bracket);
	  }
		System.out.println();
		System.out.println("Second way to itterate:");
		System.out.println();
		
	 for (Iterator iterator = brackets.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		System.out.println(string);
		
	 }
	 
	  
	}
	
	static HashSet<String> combinationOfBrackets(String expression,int n) {
		HashSet<String>brackets=new HashSet<>();
		if (expression.length()==n) {
		   brackets.add(expression);
		   return brackets;
		}
	
		HashSet<String>currentBrackets=combinationOfBrackets(expression+"()",n);
		brackets.addAll(currentBrackets);
		currentBrackets=combinationOfBrackets("("+expression+")",n);
		brackets.addAll(currentBrackets);
		currentBrackets=combinationOfBrackets("()"+expression,n);
		brackets.addAll(currentBrackets);
		
		return brackets;
		
	
			
		
		
	}

}
