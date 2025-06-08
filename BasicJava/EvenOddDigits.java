//Count even and odd digits in a number – Loop through digits
import java.util.*;
class EvenOddDigits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int digit,even=0,odd=0;
		while(n>0){
			digit = n%10;
			if(digit%2==0) even++;
			else odd++;
		    n=n/10;
		}
		System.out.println("Even Number of Digits = "+even);
		System.out.println("Odd Number of Digits = "+odd);
	}
}

		
		