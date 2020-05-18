package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListProgram {
    List<String> arrayList;

    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("SQL");
        arraylist.add("UNIX");
        arraylist.add("Testing Fundamentals");
        arraylist.add("Web Services");

        System.out.println("In array form-- "+arraylist);

        String searchEle = "UNIX";
        if (arraylist.contains(searchEle)) {
            System.out.println("Element found");
        }

        System.out.println("Using Iterator--");
        Iterator i = arraylist.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("Using ListIterator, in reverse order--");
        int index = arraylist.size();
        ListIterator li = arraylist.listIterator(index);
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
