// Find maximum element – Loop through array, track max
import java.util.*;
class MaxArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array elements :");
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i =1;i<n;i++){
			if(a[i]>max){
				max = a[i];
			}
		}
		System.out.println("Max element is "+max);
		
	}
}
		