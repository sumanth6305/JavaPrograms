//Print each character – Loop through string
import java.util.*;
class CharacterPrint{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
		}
	}
}
