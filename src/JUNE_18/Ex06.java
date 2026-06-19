package JUNE_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        // list, map, set
//        ArrayList list = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        // 제너릭 -> 객체/참조 타입 -> 대문자로 시작하는 것만.
//        ArrayList<int> list2
        ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<참조타입> -> 대문자로 시작하는 형태. int -> Integer, char -> Character
        // 나머지는 원래 호칭과 기본 타입 키워드가 일치하므로 대문자로만 맨앞으로 바꿔주면 된다
        List<String> list3 = new ArrayList<>(); // <> -> 생략 => 변수 타입을 따라가므로 생략
        // 인터페이스명<제너릭타입> 변수명 = new 구현클래스명<(타입생략)>();
        // 1. 메서드 사용
        list.add("Hello");
        list2.add(1); // 값을 추가할 때는 인덱스 X
        System.out.println("list = " + list);
        System.out.println("list2 = " + list2);
        System.out.println("list.get(0) = " + list.get(0));
//        System.out.println("list.get(1) = " + list.get(1));
//        Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        // IndexOutOfBoundsException
        list.remove(0);
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        List<Integer> list4 = List.of(1, 2, 3, 5, 8, 13); // !!!
        System.out.println("list4 = " + list4);
        // java 배열 리터럴을 바로 패러미터에 넣을 수 X.
//        List<String> list5 = Arrays.asList(new String[]{"a", "b", "c"});
        String[] stringArr = {"a", "b", "c"}; // 초기화할 때만 순수 리터럴 허용
        List<String> list5 = Arrays.asList(stringArr);
        list5.set(2, "C");
        System.out.println("list5 = " + list5);
        // add -> 추가
        // get, set -> index 기반 조회, 수정
        // remove -> 인덱스 또는 값 기반 삭제
        // size `()` -> 길이. for문.

        // for문
        for (int i = 0; i < list5.size(); i++) {
            System.out.println("i = " + i);
            System.out.println("list5.get(i) = " + list5.get(i));
            list5.set(i, list5.get(i).repeat(2));
        }
        System.out.println("list5 = " + list5);

        // for-each문
        for (String v : list5) { // 제너릭에서 지정했던 타입이 readonly 변수로
            System.out.println("v = " + v);
        }
    }
}