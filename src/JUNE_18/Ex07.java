package JUNE_18;

import java.util.HashMap;
import java.util.Map;

public class Ex07 {
    public static void main(String[] args) {
        // K, V -> 키 타입, 값 타입
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1000);
        map.put("banana", 2000); // key -> value
        System.out.println("map = " + map);
        System.out.println("map.get(\"apple\") = " + map.get("apple"));
//        map.put("banana", 20000);
        map.put("banana", map.get("banana") * 10);
        System.out.println("map = " + map);

        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "java.util.Map.get(Object)" is null
        System.out.println("map.get(\"cherry\") = " + map.get("cherry")); // null
//        map.put("cherry", map.get("cherry") * 10);
        map.put("cherry", map.getOrDefault("cherry", 0) * 10);
        System.out.println("map = " + map);
        map.remove("cherry");
        System.out.println("map = " + map);

        System.out.println("map.size() = " + map.size());
        System.out.println("map.containsKey(\"apple\") = " + map.containsKey("apple"));
        System.out.println("map.containsKey(\"mango\") = " + map.containsKey("mango"));
        System.out.println("map.containsValue(1000) = " + map.containsValue(1000));
        System.out.println("map.containsValue(10000) = " + map.containsValue(10000));

        System.out.println("map.keySet() = " + map.keySet());
        for (String s : map.keySet()) {
            System.out.println("s = " + s);
            System.out.println("map.get(s) = " + map.get(s));
        }
        System.out.println("map.values() = " + map.values());
        for (Integer v : map.values()) {
            System.out.println("v = " + v);
        }
        System.out.println("map.entrySet() = " + map.entrySet());
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("e = " + e);
            System.out.println("e.getKey() = " + e.getKey());
            System.out.println("e.getValue() = " + e.getValue());
        }
        // put (key, value)
        // get (key)
        // remove (key)
        // size. / keySet, values, entrySet -> forEach
        // default, contains...
    }
}