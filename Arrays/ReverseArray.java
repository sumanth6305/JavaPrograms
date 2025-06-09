//Reverse an array – Print from last to first index
import java.util.*;
class ReverseArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array elements :");
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements int reverse order are :");
		for(int i =n-1;i>=0;i--){
			System.out.println(a[i]);
		}
	}
}
		