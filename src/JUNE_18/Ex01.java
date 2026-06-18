package JUNE_18;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 반복문 while
        while (true) {
            System.out.println("당신의 포켓몬을 선택하세요");
            System.out.println("1: 이상해씨, 2: 꼬부기, 3: 파이리, 4: 피카츄");
            int choice = sc.nextInt();
            String pokeName = switch (choice) {
                case 1 -> "이상해씨";
                case 2 -> "꼬부기";
                case 3 -> "파이리";
                case 4 -> "피카츄";
                default -> "";
            };
            if (pokeName.isBlank()) {
                System.out.println("다시 선택해주세요");
            } else {
                System.out.println("당신의 포켓몬은 " + pokeName + "입니다");
                break;
            }
        }
    }
}