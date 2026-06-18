package JUNE_17;

public class Ex05 {
    public static void main(String[] args) {
        // 2진법
        // 0 -> 1 -> 10 -> 11 -> 100 ...
//        int a = 1 << 0; // 왼쪽이동
        int a = 1 << 1; // 왼쪽이동 -> 01 -> 10
        int b = 1 << 2;
        // 왼쪽으로 이동하면서 0이 붙는 개념
        System.out.println(a); // 1 -> 10
        System.out.println(Integer.toBinaryString(a));
        System.out.println(b); // 1 -> 100
        System.out.println(Integer.toBinaryString(b));
        int c = 255; // 2의 배수 2^8 - 1 => 11111111
        System.out.println(Integer.toBinaryString(c));
        int d = c >> 2;
        System.out.println(Integer.toBinaryString(d));
        int e = -255 >> 2;
        System.out.println(e);
        System.out.println(Integer.toBinaryString(e));
        int f = -255 >>> 2;
        System.out.println(f);
        System.out.println(Integer.toBinaryString(f));
        // 0, 1 -> boolean
        int option1 = 0;
        int option2 = 1;
//        System.out.println(option1 && option2); // boolean만 가능
        System.out.println(option1 & option2); // 이진수로 표현했을 때의 자리수가 같은 것만 1로 유지
        // 단축연산 X
//        System.out.println(option1 || option2);
        System.out.println(option1 | option2);
        // 비트마스크, 비트마스킹.
    }
}