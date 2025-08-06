//Compare two strings – Equal or not using .equals() 
import java.util.*;
class StringEquals{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String str1 = sc.next();
		String str2 = sc.next();
		if(str1.equals(str2)) System.out.println("Strings are same");
		else System.out.println("Strings are not same");
	}
}
		
	