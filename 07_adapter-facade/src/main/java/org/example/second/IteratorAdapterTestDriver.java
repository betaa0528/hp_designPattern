package org.example.second;

import java.util.ArrayList;
import java.util.List;

public class IteratorAdapterTestDriver {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        IteratorationEnumerator iterator = new IteratorationEnumerator(list.iterator());
        while(iterator.hasMoreElements()) {
            System.out.println(iterator.nextElement());
        }
    }
}
