//Calculate sum of all elements – Add elements using for loop
import java.util.*;
class ArraySum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array elements :");
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int sum = a[0];
		for(int i =1;i<n;i++){
			sum = sum+a[i];
		}
		System.out.println("Sum of all elements in array = "+sum);
		
	}
}
		