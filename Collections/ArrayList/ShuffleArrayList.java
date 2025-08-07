//Write a program to shuffle the elements of an ArrayList.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class ShuffleArrayList {
    public static void main(String[] args) {
       ArrayList<String> al = new ArrayList<String>(Arrays.asList("Banana","Apple","Mango","Pine Apple"));
       Collections.shuffle(al);
       System.out.println("After shuffling : "+al);
       
    }
}
