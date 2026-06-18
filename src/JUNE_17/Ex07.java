package JUNE_17;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // switch
        Scanner sc = new Scanner(System.in);
//        System.out.print("이름을 입력해주세요 : ");
//        String name = sc.nextLine();
//        if (name.isBlank()) {
//            name = "김윌리엄반찬가게씨";
//        } // 이것 자체는 그대로 (boolean으로 평가되는 것)
//        System.out.println("반갑습니다 " + name);
        System.out.print("마시고 싶은 음료 (콜라,사이다,우유) : ");
        String drink = sc.nextLine();
        switch (drink) {
            case "제로콜라": // break가 없어서 fall-through 유도하는 경우 - 동일한 로직의 유사한 조건
            case "콜라":
                System.out.println("콜라가 나왔습니다");
                break; // 없으면 fall-through
            case "사이다":
                System.out.println("사이다가 나왔습니다");
                break;
            case "우유":
                System.out.println("우유가 나왔습니다");
                break;
            default:
                System.out.println("없는 음료입니다");
        }
        // switch 표현식 (jdk 14+)
        int price = switch (drink) {
            // java 에서의 화살표는 '->'
            // js 에서의 화살표는 '=>'
            case "콜라" -> 1000; // ->
            case "제로콜라", "사이다" -> 1100;
            case "우유" -> 2000;
            default -> 0;
        };
        System.out.println(price + "원입니다");
        sc.close();
    }
}