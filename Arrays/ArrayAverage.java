//Find average of array – Sum ÷ total elements
import java.util.*;
class ArrayAverage{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter the elements of array");
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int sum =0;
		for(int i =0;i<n;i++){
			sum = sum+a[i];
		}
		int average= sum/n;
		System.out.println("Average of array elements = "+average);
	}
}