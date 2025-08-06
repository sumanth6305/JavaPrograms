//. Check if a number is prime – Only divisible by 1 and itself 
import java.util.*;
class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		for(int i=2;i<n;i++){
			if(n%i==0){
				System.out.println("Not a Prime number");
				return ;
			}
		}
		System.out.println("Prime number");
	}
}
