package generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> l = new MyArrayList<String>();
        //l.add(5); не скомпилируется
        ArrayList d;
        l.add("aaa");
        l.add("qwerty");
        l.add("bbbb");
        String s = l.get(0);
        System.out.println(l.contains("abc"));
        Object[] l3 = l.toArray();
        MyArrayList<String> l4 = new MyArrayList<String>();
        l4.add("cccc");
        l.addAll(l4);
        //classic using iterator of MyArrayList
        /*Iterator<String> iter = l.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }*/

        //foreach using iterator
        for(String str : l) {
            System.out.println(str.toUpperCase());
        }

    }
}