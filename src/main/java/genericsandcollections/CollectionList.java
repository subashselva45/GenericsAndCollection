package genericsandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Aari");
        list.add("Shivani");
        list.add("Ramya");
        //list.add(2);
        // list.add(2,"Bala");

        List<String> names = Arrays.asList("Rio","Aajeeth","Nisha","Jithan");
        list.addAll(3,names);
        System.out.println(list);
        System.out.println(list.get(5));

        list.retainAll(Arrays.asList("vivek"));
    }
}
