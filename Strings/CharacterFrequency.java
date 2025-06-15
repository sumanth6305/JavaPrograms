// Find frequency of each character – Loop with nested count 
import java.util.*;
class CharacterFrequency{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str1 = sc.nextLine();
		String str =str1.toLowerCase();
		
		HashMap<Character,Integer> hm = new HashMap();
		for(char c :str.toCharArray()){
			int count =0;
			if(c==' ') continue;
			for(char temp :str.toCharArray()){
				if(c==temp){
					count++;
				}
			}
			hm.put(c,count);
		}
	    System.out.println("Frequency of each character : "+hm);
	}
}
		
				