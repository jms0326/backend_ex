package JUNE_18;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex08 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("원이");
        set.add("원이");
        set.add("원이");
        set.add("원이");
        set.add("원이");
        set.add("원이");
        set.add("미나미");
        set.add("제나");
        set.add("리브");
        set.add("메이");
        System.out.println("set = " + set);
        set.remove("리브");
        System.out.println(set.contains("메이"));
        System.out.println(set.contains("제나"));
        System.out.println(set.contains("리브"));
        System.out.println("set = " + set);

        // add, remove, contain***
        // get -> list, map
        // put -> map. set -> list
        Set<String> set2 = new HashSet<>(List.of("감", "밤", "대추", "대추"));
        System.out.println(set2);

        for (String s : set2) {
            System.out.println("s = " + s);
        }

        // size / array length.
    }
}