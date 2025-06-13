//Check if string is palindrome 
import java.util.*;
class StringPalindrome{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		StringBuffer str = new StringBuffer(sc.next());
		StringBuffer rev= new StringBuffer();
	    for(int i=str.length()-1;i>=0;i--){
			rev.append(str.charAt(i));
		}
		System.out.println(rev);
		if(str.toString().equals(rev.toString())) System.out.println("Palindrome");
		else System.out.println("Not palindrome");
		
	}
}
			