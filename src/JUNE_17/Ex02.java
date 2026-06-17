package JUNE_17;

public class Ex02 {
    public static void main(String[] args) {
        // 숫자 - 정수형
        byte by = 127; // -128 ~ 127 (2^8)
        // bit 0,1 -> byte : bit 8 -> 0/1 -> 256 - +- 부호를 나눠가짐. 128 / 128
        // -128 ~ 0 ~ 127
//        by = -129;
//        by = 128;
        System.out.println(by); // 1바이트
        short sh = 32767; // -32768 ~ 32767 (65536) 2^16 // 2바이트
        System.out.println(sh); // 42억. 21억.
        int i = 2_147_483_647 ; // -2,147,483,648 ~ 2,147,483,647 (42억) 2^32 // 32비트, 4바이트
        // 알고리즘할 때, 로그나 메트릭, 데이터 -> 잘못하면 21억을 쉽게 넘음. (id)
        long il = 2_147_483_647; // integer 범위 내에서는 long으로 넣으면 되는데 그걸 넘어가면 L붙여줘야함
        long ll = 1L;
        long l = 9_223_372_036_854_775_807L; // 8바이트, 64비트
        // L을 붙여야하는데...
        // 한도가 엄청 크다
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        // long의 범위를 넘어가면 'BigInteger'

        // 숫자 - 실수형
        float f = 3.141592f; // 32비트(4바이트)의 단정밀도 - 7자리수까지 문제 없이
        double d = 3.141592; // 64비트(8바이트) - 15~16자리.
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        // 부동소수점 -> 컴퓨터는 0,1을 사용해서 2진수의 숫자체계를 가지고 우리는 10진수를 가져서
        // 특히 소수를 표현할 때는 약간의 오차가 있음.
        // BigDecimal (더 높은 정밀도가 요청되거나 부동소수점 이슈를 해결하기 위해...)

        // 정수형 - int (접미사 X) 알고리즘, 큰수, 대규모데이터를 다룰 경우 long. 파일을 다룰 때 byte.
        // 실수형 - double

        // 문자형 char
        System.out.println("A " + ('A' + 0) + " Z " + ('Z' + 0)); // 65 ~ 90
        System.out.println("a " + ('a' + 0) + " z " + ('z' + 0)); // 97 ~ 122
        char c1 = 91;
        char c2 = 123;
        System.out.println(c1 + " " + c2);
        // 대문자에 32를 빼면 소문자가 되고, 소문자에 32를 더하면 대문자가 됨. (알파벳기준)

        // 불리언 true/false
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 + " " + b2);

        // 문자, 문자열, 문자배열
        char cc1 = 'A';
        char cc2 = 'B';
        char cc3 = 'C';
        System.out.println(cc1 + "" + cc2 + "" + cc3);
        char[] carr = {cc1, cc2, cc3};
        System.out.println(carr);
        String ss = "ABC";
        System.out.println(ss);

        // 암(묵)시적 형변환, 명시적 형변환
        long lll = 123; // 들어가짐 -> long이 차지할 수 있는 메모리가 더 넓기 때문에 굳이 뭔가 의식할 필요가 없음
//        int iii = 3_145_920_000L; // 들어가지 못함;
        int iii = (int) 3_145_920_000L; // 들어가지 못함;
        // 64비트를 32비트에 우겨넣는 과정에서 일부만 들어감
        int iii2 = 'a';
        System.out.println("iii = " + iii);
        double dd = 1;
        int iii3 = (int) 3.141592;
        System.out.println("dd = " + dd);
        System.out.println("iii3 = " + iii3); // 소수점 부분을 탈락시키면 정수부로 넣을 수 있으니 그쪽 메모리를 탈락

    }
}