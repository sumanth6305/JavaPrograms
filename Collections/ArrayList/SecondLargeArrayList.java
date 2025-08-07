//Write a program to find the second-largest element in an ArrayList of Integers.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class SecondLargeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new  ArrayList<Integer>(Arrays.asList(1,20,23,44,51,12,3,76,89,99,5,8,9));
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("The second largest element in ArrayList is : "+al.get(1));
       
    }
}
