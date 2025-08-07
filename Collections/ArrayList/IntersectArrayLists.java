//Write a program to find the intersection of two ArrayLists.
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class IntersectArrayLists  {  
    public static void main(String[] args) {
       ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
       ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,3,5,6,7,8,9,10));
       ArrayList<Integer> intersection = new ArrayList<Integer>(list1);
       intersection.retainAll(list2);
       System.out.println(intersection);
    }
}
