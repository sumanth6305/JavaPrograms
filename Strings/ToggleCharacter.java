// Toggle character case - "Hello" -> "hELLO"
import java.util.*;
class ToggleCharacter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter a string");
		str = sc.nextLine();
		char temp;
		StringBuffer bf= new StringBuffer();
		for(int i =0;i<str.length();i++){
			temp = str.charAt(i);
			if(Character.isUpperCase(temp)){
				temp=Character.toLowerCase(temp);
				bf.append(temp);
			}
			else{
				bf.append(Character.toUpperCase(temp));
			}
			
		}
		System.out.println(bf);
	}
}
		
		