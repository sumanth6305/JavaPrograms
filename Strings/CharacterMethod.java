// Count letters, digits, special chars – Use Character methods
import java.util.*;
class CharacterMethod{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str= sc.nextLine();
		char temp;
		int letter=0,digit=0,whites=0,special=0;
		for(int i=0;i<str.length();i++){
			temp = str.charAt(i);
			if(Character.isLetter(temp)) letter++;
			else if(Character.isDigit(temp)) digit++;
			else if(Character.isWhitespace(temp)) whites++;
			else special++;
		}
		System.out.println("Digits = "+digit);
		System.out.println("Letters = "+letter);
		System.out.println("White spaces = "+whites);
		System.out.println("Special characters  = "+special);
		
	}
}
			
