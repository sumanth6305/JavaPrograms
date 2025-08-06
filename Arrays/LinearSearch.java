//Linear search – Find if element exists in array
import java.util.*;
class LinearSearch{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter the elements of array");
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search");
		int target = sc.nextInt();
		for(int i =0;i<n;i++){
			if(a[i]==target){
				System.out.println(target+" is present at location : "+i);
				return;
			}
		}
		System.out.println("Element is not found at any location");
	}
}



