//Count digits in a number – Use while loop to divide by 10 and count.
import java.util.*;
class DigitCount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int i=0;
		while(n>0){
			n=n/10;
		    i++;
		}
		System.out.println("digits = "+i);
	}
}
