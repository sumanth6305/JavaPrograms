//Count even and odd numbers in array – Use condition for each element
import java.util.*;
class EvenOddArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array elements :");
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int even =0,odd =0;
		for(int i =0;i<n;i++){
			if(a[i]%2==0) even++;
			else odd++;
		}
		System.out.println("Even number of elements = "+even);
		System.out.println("Odd number of elements = "+odd);
		
	}
}
		