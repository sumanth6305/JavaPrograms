//Find sum of first N natural numbers – Use loop or formula. 
import java.util.*;
class NaturalNumbersSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int sum=0;
		//loop
		for(int i=0;i<=n;i++){
		  sum = sum+i;
		}
		
		System.out.println(sum);
		//formula
		//sum = n*(n+1)/2;
		//System.out.println(sum);
		
		
	}
}


	    
		