// Replace spaces with dashes hello world -> hello-world
import java.util.*;
class ReplceSpace{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		StringBuffer str = new StringBuffer(sc.nextLine());
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				str.setCharAt(i,'-');
			}
		}
		System.out.println(str);
	}
}