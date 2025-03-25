
//use of iterator with array list//

// Iterator iterates untill the data is in arraylist.

import java.util.*;

public class ArrayList_Example1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Kohli");
        list.add("Patidar");
        list.add("Salt");
        list.add("Shephard");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

    }
}