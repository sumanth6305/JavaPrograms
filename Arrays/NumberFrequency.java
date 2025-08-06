// Count frequency of an element – e.g., count how many 5’s
import java.util.*;
class NumberFrequency{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter the elements of array");
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element to find ftrequency : ");
		int target = sc.nextInt();
		int flag =0;
		for(int i =0;i<n;i++){
			if(a[i]==target){
				flag++;
			}
		}
		if(flag==0) System.out.println("Element is not found at any location and frequency is 0");
		else System.out.println("Frequency of "+target+" = "+flag);
	}
}



