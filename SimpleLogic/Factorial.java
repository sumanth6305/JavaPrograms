//Calculate factorial of a number – Multiply numbers from 1 to N.
import java.util.*;
class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int fact = 1;
		for(int i =1;i<=n;i++){
			fact = fact*i;
		}
		System.out.println("Factoril of "+n+" = "+fact);
	}
}

		