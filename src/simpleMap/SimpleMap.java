package simpleMap;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    private static Map<String, Integer> map = new HashMap<>();

    public static void add(String name, Integer num) {
        if (map.containsKey(name) && map.get(name).intValue() == num) {
            throw new RuntimeException(name + "/" + num + " не добавлено");
        }
        map.put(name, num);
    }

    public static void print() {
        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
