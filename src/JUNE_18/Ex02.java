package JUNE_18;

public class Ex02 {
    public static void main(String[] args) {
        // for + while
        // fori
//        int i = 0; // scope 문제
        // 정방향 (++)
        for (int i = 1; i <= 9; i++) {
            System.out.println("i = " + i);
        }
        int w = 1;
        while (w <= 9) {
            System.out.println("w = " + w++);
        }

        // 역방향 (--)
//        for (int i = 1; i <= 9; i--) { // 무한 반복
        for (int i = 9; i > 0; i--) { // 무한 반복
            // 종료조건을 못 만나서
            System.out.println("i = " + i);
        }
        w = 9;
        while (w >= 1) {
            System.out.println("w = " + w--);
        }
        // scope.

        // 이중 for문
        for (int i = 1; i <= 9; i++) {
//            for (int i = 1; i <= 9; i++) { // 스코프 겹침 문제
//            for (int j = 1; j <= 9; i++) { // 증감식을 잘못 지정
            System.out.println("i = " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println("j = " + j);
                System.out.println(i + " * " + j + " = " + i * j);
                // 맨 안에 있는 루프가 가장 먼저 종료되고 나서야 다음 루프의 다음 단계로 진행한다
            }
        }
        // 삼중 for문 (금단의 다중포문) - 실무적으로는 이런 일이 많이 없고, 알고리즘적으로는 복잡도 최악
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    System.out.println("k = " + k);
                    System.out.println(i + " * " + j + " * " + k + " = " + i * j * k);
                }
            }
        }
    }
}