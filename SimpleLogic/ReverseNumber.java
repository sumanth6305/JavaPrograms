//Reverse a number – Input: 123 → Output: 321 
import java.util.*;
class ReverseNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int temp = n,rem=0,rev=0;
		while(n>0){
			rem = n%10;
			rev = rem +rev*10;
			n=n/10;
		}
		System.out.println(rev);
	}
}
