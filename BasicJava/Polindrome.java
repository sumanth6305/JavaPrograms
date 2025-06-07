//Check if a number is palindrome – 121 → palindrome; 123 → not 
import java.util.*;
class Polindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter  number");
		int n = sc.nextInt();
		int rev=0;
		int rem=0;
		int temp = n;
		while(n>0){
			rem = n%10;
			rev = rem+rev*10;
			n=n/10;
		}
		if(temp == rev) System.out.println("polindrome");
		else System.out.println("Not a polindrome");
	}
}

			