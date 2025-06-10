//Reverse a string
import java.util.*;
class StringReverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		StringBuffer rev = new StringBuffer();
		for(int i =s.length()-1;i>=0;i--){
			rev = rev.append(s.charAt(i));
			
		}
		System.out.println(rev);
	}
}