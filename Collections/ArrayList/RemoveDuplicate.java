//Write a program to remove all duplicate elements from an ArrayList
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
class RemoveDuplicate{
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(12);
		numbers.add(14);
		numbers.add(10);
		numbers.add(12);
		numbers.add(16);
		numbers.add(11);
		System.out.println("Before removing duplicates"+numbers);
		Set<Integer> ints = new HashSet<>(numbers);
		numbers.clear();
		numbers.addAll(ints);
		System.out.println("After removing duplicates"+numbers);
	}
}

		