// Print Floyd’s Triangle – 1 2 3, 4 5 6 … using nested loops
import java.util.*;
class FloydTriangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int count =0;
		for(int i=1;i<+n;i++){
			for(int j=1;j<i;j++){
				count++;
				System.out.print(count+"  ");
			}
			System.out.println();
		}
	}
}
		
