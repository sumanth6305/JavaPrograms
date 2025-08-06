//2.	Write a program to find the maximum element from an ArrayList of Integers.
import java.util.ArrayList;
import java.util.Collections;
class MaxArrayList{
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(22);
		numbers.add(33);
		numbers.add(11);
		numbers.add(99);
		int max = Collections.max(numbers);
		System.out.println("Maximum number is :"+max);
	}
}
		