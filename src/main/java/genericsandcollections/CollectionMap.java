package genericsandcollections;

import java.util.*;

public class CollectionMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
//        map.put("subash",new Task("selvaraj",55));
//        map.put("karthick",new Task("kresh",1));
//        map.put("subash",new Task("kresh",1));
//        System.out.println(map);
//        map.
        map.put("A", 0);
        map.put("B", 0);
        map.put("C", 0);
        map.put("D", 0);
        map.put("E", 0);
        System.out.println(map);
        map.compute("F", (k,v) -> {
            System.out.println(k);
            System.out.println(v);
            if (v == null) {
                v = 0;
            }
            return v;

        });
        System.out.println(map);
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key+ map.get(key));
        }
//        Collection<Integer> values = map.values();
//        for (Integer value: values){
//            System.out.println(value);
//        }
//
        map.forEach((k,v)-> System.out.println(k+ v));

        Date today = new Date();
        System.out.println(today);

//        int[] a = new int[]{1,2,3};
//        int[] b = new int[]{};
//        int[] c = new int[0] {};
//        String[] d = new String[1]{"tiger"};
    }
}
