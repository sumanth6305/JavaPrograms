// Find minimum element – Same, track min
// Find maximum element – Loop through array, track max
import java.util.*;
class MinArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array elements :");
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int min = a[0];
		for(int i =1;i<n;i++){
			if(a[i]<min){
				min= a[i];
			}
		}
		System.out.println("Min element is "+min);
		
	}
}
		