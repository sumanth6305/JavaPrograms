//Find sum of digits – 123 → 1+2+3 = 6
import java.util.*;
class DigitSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int temp  = n;
		int digit,sum=0;
		while(n>0){
			digit = n%10;
			n=n/10;
			sum= sum+digit;
		}
		System.out.println("Digit sum = "+sum);
	}
}

