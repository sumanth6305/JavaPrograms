//Input and print an array – Take n elements from user and print
import java.util.*;
class PrintArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array elements :");
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements are :");
		for(int i =0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}
		