import java.util.ArrayList;
import java.util.Collections;
class SortArrayList{
	public static void main(String args[]){
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Sumanth");
		strings.add("reddy");
		strings.add("Chandra");
		strings.add("sekhar");
		System.out.println("Strings before sorting"+strings);
		Collections.sort(strings);
		System.out.println("Strings after sorting "+strings);
		
	}
}
	
		