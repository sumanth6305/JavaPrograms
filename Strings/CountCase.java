// Count uppercase/lowercase characters – Use isUpperCase() & isLowerCase()
import java.util.*;
class CountCase{
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
		String str = sc.nextLine();
		String str2 = str.replace(" ","");
		int lower=0,upper =0;
		char temp;
        for(int i=0;i<str2.length();i++){
            temp = str2.charAt(i);
            if(Character.isUpperCase(temp))  upper++;
            else lower ++;
		}
		System.out.println("No of lower case letters = "+lower);
		System.out.println("No of upper case letters = "+upper);
	}
}
		