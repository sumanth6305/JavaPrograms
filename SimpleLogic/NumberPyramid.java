// Print number pyramid – 1, 12, 123 … pattern using nested loops
import java.util.*;
class NumberPyramid{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for(int i =1;i<n+1;i++){
			for(int j=i;j<n+1;j++){
				System.out.print(" ");
			}
			for(int k=1;k<i+1;k++){
				System.out.print(k+" ");
			}
			System.out.println();
			
		}
		
		
	}
}

