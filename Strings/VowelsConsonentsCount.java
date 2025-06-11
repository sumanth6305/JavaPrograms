//Count vowels and consonants – Use loop + condition
import java.util.*;
class VowelsConsonentsCount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str;
		str = sc.nextLine();
		char temp;
		int vowels=0,consonants=0;
		for(int i=0;i<str.length();i++){
			temp = str.charAt(i);
			if(temp == ' ') continue;
			if(temp =='a'||temp =='e'||temp =='i'||temp =='o'||temp =='u'||temp =='A'||temp =='E'||temp =='I'||temp =='O'||temp =='U'){
				vowels++;
			}
			else consonants++;
		}
		System.out.println("No. of Vowels = "+vowels);
		System.out.println("No. of Consonants = "+consonants);
	}
}

			