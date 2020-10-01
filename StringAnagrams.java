package Strings;
import java.util.Scanner;
public class AnagramOfAString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first string: ");
		String a = sc.nextLine();
		System.out.println("Enter your second string: ");
		String b = sc.nextLine();
		
		boolean isAnagram = false;
		
		for(int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			isAnagram = false;
			
			for(int j = 0; j < b.length(); j++) {
				if(b.charAt(j) == c) {
					isAnagram = true;
					
					break;
				}
			}
			if(! isAnagram) {
				break;
			}
 		}
		
		if(isAnagram) {
			System.out.println("The numbers are anagrams of each other.");
		}
		else {
			System.out.println("The numbers are not anagrams of each other.");
		}
		
	}
}
