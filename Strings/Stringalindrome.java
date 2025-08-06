// Check if string is palindrome
import java.util.*;
class Stringalindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		StringBuilder rev = new StringBuilder();
		for(int i =s.length()-1;i>=0;i--){
			rev.append(str.charAt(i));
			
		}
		//String temp = rev;
		if(rev==s)  System.out.println("Polindrome");
		else System.out.println("Not Polindrome");
	}
}