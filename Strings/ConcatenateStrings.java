//Concatenate two strings – Without using +
import java.util.*;
class ConcatenateStrings{
	 public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings: ");
		String str1 = sc.next();
		String str2 = sc.next();
		StringBuilder sb = new StringBuilder(str1);
		sb.append(str2);
		System.out.println("After concatenation : "+sb);
	 }
}