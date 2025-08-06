//Check Armstrong number – 153 → 1³+5³+3³ = 153 
import java.util.*;
class Amstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp =n,num,digit=0;
		int i=0,power=0;;
		while(temp>0){
			digit++;
			temp=temp/10;
		}
		
	    temp =  n;
		int amstrong =0;
		while(temp>0){
			num = temp%10;
			amstrong += Math.pow(num,digit);
			temp =temp/10;
		}
	if(amstrong==n) System.out.println("Amstrong number ");
	else System.out.println("Not an Amstrong Number ");
}
}

			
			
			