<<<<<<< HEAD
//Check if array is sorted – Ascending or not
import java.util.*;
class ArraySortCheck{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter the elements of array");
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int temp = a[0];
		int flag =0;
		for(int i =1;i<n;i++){
			if(a[i]>temp) {
				temp = a[i];
			    flag =1;
			}
			else{	
			System.out.println("Array elements not in sorted order");
			break;
		}
		}
		if(flag==1) System.out.println("Array elements are in sorted order");
	}
}
=======
//Check if array is sorted – Ascending or not 
import java.util.*;
class ArraySortCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array elements :");
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int min = a[0],flag=0;
		for(int i =1;i<n;i++){
			if(a[i]>min){
				flag=1;
				min = a[i];
			}
			else {
				flag = 0;
				break;
			}
		}
		if(flag==1) System.out.println("The array is sorted ");
		else System.out.println("The array is not sorted");
		
	}
}
		
>>>>>>> 381e851 ( Array sort check)
