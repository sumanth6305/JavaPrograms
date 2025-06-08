//Print Fibonacci series up to N terms – Use loop  
import java.util.*;
class Fibonacci{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print fibonocci series : ");
		int n = sc.nextInt();
		int a=0;
		int b = 1;
		int c;
		while(n>0){
			System.out.println(a);
			c=a+b;
			b=a;
			a=c;
			n--;
		}
	}
}

			
			