// Print multiplication table of a number – e.g., 2 x 1 = 2 to 2 x 10 = 20 
import java.util.*;
class Multiplication{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for multiplication : ");
		int n = sc.nextInt();
		int mul;
		for(int i = 1;i<=10;i++){
			mul = n*i;
			System.out.println(n+" X "+i+" = " +mul);
		}
	}
}

		