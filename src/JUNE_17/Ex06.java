package JUNE_17;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // if
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();
//        if (name.length()) { // 빈 이름을 입력했다면 초기값을 주자
//        if (name.length() == 0) {
        if (name.isBlank()) {
            name = "김윌리엄반찬가게씨";
        }
        System.out.println("반갑습니다 " + name);
        System.out.print("점수를 입력해주세요 : ");
        int score = sc.nextInt();
        // 0에서 100 사이의 값만 입력 가능
        if (score >= 0 && score <= 100) {
//            System.out.println("당신의 점수는 " + score + "입니다");
            if (score > 70) {
                System.out.println("당신의 등급은 A입니다");
            } else if (score > 40) {
                System.out.println("당신의 등급은 B입니다");
            } else {
                System.out.println("당신의 등급은 C입니다");
            }
        } else {
            System.out.println("0과 100 사이의 값을 입력하세요");
        }
        sc.close();
    }
}