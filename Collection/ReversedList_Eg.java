import java.util.*;;

public class ReversedList_Eg {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("SRH");
        ll.add("DC");
        ll.add("MI");
        ll.add("RCB");

        Iterator i = ll.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
