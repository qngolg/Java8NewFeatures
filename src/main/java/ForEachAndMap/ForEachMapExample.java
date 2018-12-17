package ForEachAndMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachMapExample {


    public static void main(String[] args) {

       // compareJava8Map();
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        System.out.println("Before Java8");
        for (String s:items) {
            System.out.print(s);
        }
        System.out.println();

        System.out.println("After Java8");
        items.forEach(item-> System.out.print(item));
        System.out.println();
        items.forEach(System.out::print);
        System.out.println();

        System.out.println("Java8 filter");
        items.stream().filter(s->s.equals("B")).forEach(System.out::println);


    }

    private static void compareJava8Map() {
        Map<String,Integer> items = getItems();

        //Before Java8
        System.out.println("Before Java8");
        for (Map.Entry e :
                items.entrySet()) {
            System.out.println("Item:"+e.getKey()+" Count:"+e.getValue());
        }

        //After Java8
        System.out.println("After Java8");
        items.forEach((k,v)-> System.out.println("Item:"+k+" Count:"+v));

        System.out.println("map filter C");
        items.forEach((k,v)->{
            if("C".equals(k)) System.out.println("Item:"+k+" Count:"+v);
        });
    }

    private static Map<String, Integer> getItems() {
        Map<String,Integer> items = new HashMap<>();
        items.put("A",12);
        items.put("B",21);
        items.put("C",18);
        items.put("D",32);
        items.put("E",45);
        items.put("F",49);
        return items;
    }

}
