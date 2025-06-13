// Count words in a sentence – Split by space
import java.util.*;
class CountWords{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String str = sc.nextLine();
		int word =0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				word++;
			}
		}
		word++;
		System.out.println(word);
	}
}
