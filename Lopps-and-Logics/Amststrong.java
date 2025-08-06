//Check Armstrong number – 153 → 1³+5³+3³ = 153 
import java.util.*;
class Amststrong{
	public staatic void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp =n;
		int[] arr ={};
		int i=0;
		while(n>0){
			num = n%10;
			arr[i]=num;
			n= n/10;
			i++;
		}
	}
}

			
			
			