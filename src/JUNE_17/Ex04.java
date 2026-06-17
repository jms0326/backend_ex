package JUNE_17;

public class Ex04 {
    public static void main(String[] args) {
        // 연산자 (산술연산자, 대입연산자, 복합대입연산자, 삼항연산자, 비교연산자)
        // 논리연산자 -> 단축연산 (A || B -> A True면 종료, A && B -> A False면 종료)

        // 1. 정수의 나누기
        int a = 10;
        int b = 3;
        int c = a / b;
//        double c2 = (a + 0.0) / b;
        double c2 = (a * 1.0) / b;
//        double c2 = a / b; // 이 경우 int 계산은 계산대로 다 되고 형변환 되는 것이므로 소수점 유지가 X
        System.out.println("c = " + c);
        System.out.println("c2 = " + c2);
        int d = a % b;
        System.out.println("d = " + d);
        double e = 10.0;
        double f = e / b;
        System.out.println("f = " + f); // 연산에 참여하는 한쪽 이상이 나누기 연산 전 double 상태라면

        // 2. 제곱
        // JS
        // 2 ** 2 -> Java에는 이런것 X
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.pow(2, 0.5));
        System.out.println(Math.random()); // 0 이상인 1 미만의 값.

        // 3. 문자열 연결 - +시 자동형변환 but 문제는 가끔씩 문자열화했을 때 기대랑 다른 타입들이 존재
        System.out.println("흥미로운 것 " + 10 + 20);
        System.out.println("흥미로운 것 " + (10 + 20)); // 헷갈리는게 심하면 변수로 빼서 집어넣으면 된다
        int i1 = 10;
        int i2 = 20;
        int i3 = i1 + i2;
        System.out.println("흥미로운 것 " + i3);

        // 4. 문자열의 비교
        String a1 = "Java";
        String a2 = "Java"; // 리터럴 문법으로 만들어서 '상수 풀'이라는 곳에 생성 -> 같은 방식으로 만들어졌다고 판정이 되면 같은 객체 주
        System.out.println("a1 == a2 " + (a1 == a2));
        System.out.println("a1 " + System.identityHashCode(a1));
        System.out.println("a2 " + System.identityHashCode(a2));
        String a3 = new String("Java"); // 직접 만든 객체이기 때문에 '힙 영역'으로 새롭게 감
        System.out.println("a1 = " + a1);
        System.out.println("a3 = " + a3);
        System.out.println("a1 == a3 " + (a1 == a3));
        System.out.println("a1 " + System.identityHashCode(a1));
        System.out.println("a3 " + System.identityHashCode(a3));
        System.out.println("a1.equals(a3) " + a1.equals(a3));
    }
}