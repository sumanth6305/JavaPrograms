//Sort characters of string – e.g., cab -> abc
import java.util.*;
class CharacterSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        char temp;

        for (int i = 0; i < sb.length() - 1; i++) {
            for (int j = 0; j < sb.length() - 1 ; j++) {
                if (sb.charAt(j) > sb.charAt(j + 1)) {
                    temp = sb.charAt(j);
                    sb.setCharAt(j, sb.charAt(j + 1));
                    sb.setCharAt(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted string: " + sb.toString());
    }
}
