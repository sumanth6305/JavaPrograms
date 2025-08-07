//Create a LinkedList and perform various operations like add, remove, and iterate over it.
import java.util.LinkedList;
import java.util.Iterator;
class LinkedListIterate {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Hello");
        list.add("World");
        list.add("This ");
        list.add(" is ");
        list.add("sumanth");
        list.add("reddy");
        System.out.println(list);
        list.remove("World");
        System.out.println(list);
        //Iterating for each loop 
        for(String s : list){
            System.out.println(s);
        }
        //By using Iterator interface 
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
