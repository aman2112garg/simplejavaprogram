package WhileLoops;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		
		while(temp > 0) {
			
			int lastDigit = temp % 10;
			temp = temp / 10;
			sum = sum + lastDigit;
			
		}
		
		System.out.println("Sum of digits of " + n + " is " + sum);
		
	}

}
