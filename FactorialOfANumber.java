package loops;
import java.util.Scanner;

public class FactorialProgram {
	
	public static void main(String[] args) {
		
		//In this program we are going to find the factorial of a number entered by a user.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n = sc.nextInt();
		
		int factorial = 1;
		
		for(int i = n; i >=1; i--) {
			
			factorial = factorial * i;
		}
		
		System.out.println("The factorial of the given number is " + factorial);
	}

}
