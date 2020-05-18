package Collections;

import java.util.*;

public class ArrayListProgram1 {


    static void addElements(List arraylist){

        arraylist.add("SQL");
        arraylist.add("UNIX");
        arraylist.add("Testing Fundamentals");
        arraylist.add("Web Services");

        System.out.println("In array form-- "+arraylist);
    }
    static void searchAList(List arraylist,String element) {

        if (arraylist.contains(element)) {
            System.out.println("Element found");
        }
    }
    static void listwithIterator(List arraylist) {

        Iterator i = arraylist.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    static void listwithListIterator(List arraylist) {

        int index = arraylist.size();
        ListIterator li = arraylist.listIterator(index);
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        addElements(arrayList);
        searchAList(arrayList,"Unix");
        System.out.println("Using Iterator--");
        listwithIterator(arrayList);
        System.out.println("Using ListIterator, in reverse order--");
        listwithListIterator(arrayList);



    }
}
