//program of Collections.sort() with array list

import java.util.*;

class SortArrayList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");

        Collections.sort(list1); // Corrected 'Collection.sort' to 'Collections.sort'
        for (String fruit : list1) {
            System.out.println(fruit);
        }

        System.out.println("Sorting numbers...");
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);

        Collections.sort(list2); // Corrected 'Collection.sort' to 'Collections.sort'

        for (Integer number : list2) {
            System.out.println(number);
        }
    }
}

