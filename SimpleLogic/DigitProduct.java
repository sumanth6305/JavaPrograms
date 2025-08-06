//Find sum of digits – 123 → 1+2+3 = 6
import java.util.*;
class DigitProduct{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int temp  = n;
		int digit,product=1;
		while(n>0){
			digit = n%10;
			n=n/10;
			product= product*digit;
		}
		System.out.println("product of digits = "+product);
	}
}

