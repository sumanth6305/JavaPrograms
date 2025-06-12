// Convert string to uppercase/lowercase – Use toUpperCase(), toLowerCase()
import java.util.*;
class CaseConverter{
	public static void main(String args[]){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		String lower = str.toLowerCase();
		String upper = str.toUpperCase();
		System.out.println("Uppercase = "+upper);
		System.out.println("Lowercase = "+lower);
	}
}
	
