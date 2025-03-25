//tp use different methods in linked list

import java.util.*;

public class LinkedList_Example {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("Initial list of elements" + ll);
        ll.add("RCB");
        ll.add("MI");
        ll.add("SRH");
        System.out.println("After Invoking add (E e) method:" + ll);
        ll.add("KKR , 1");
        System.out.println("After invoking add(int index, E element) method: " + ll);
        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("GL");
        ll2.add("LSG");

        ll.addAll(ll2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: " + ll);

        LinkedList<String> ll3 = new LinkedList<>();
        ll3.add("PBKS");
        ll3.add("RR");

        ll.addAll(1, ll3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + ll);

        ll.addFirst("DC");
        System.out.println("After invoking addFirst(E e) method: " + ll);

        ll.addLast("CSK");
        System.out.println("After invoking addLast(int index, Collection<? extends E> c) method: " + ll);

    }
}
