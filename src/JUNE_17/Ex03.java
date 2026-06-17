package JUNE_17;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // 표준 입출력 - Standard Input/Output(I/O)
        // System.out.println();
        System.out.println("시작");
        Scanner sc = new Scanner(System.in);
//        sc.next();
//        String name = sc.next(); // 공백을 기준으로 구분하기 때문에, 단어 하나만 넣어줘야함
//        System.out.println("name = " + name);
        String w1 = sc.next(); // '자바 좋아요'를 한 번에 입력하면 앞의 스페이스를 알아서 구분해서 가져간다
        String w2 = sc.next(); // 스페이스를 만나기 전까지는 대기한다
        System.out.println("w1 = " + w1);
        System.out.println("w2 = " + w2); // \n
        sc.nextLine(); // 이걸 중간에 끼어넣으면 중간에 들어간 \n 를 없앨 수 있음.
        String w3 = sc.nextLine(); // \n을 만나면 버퍼 종료 (지금까지 받은 데이터를 모두 버퍼에서 제거하고 변수에 대입)
        System.out.println("w3 = " + w3);
        String w4 = sc.nextLine(); // 이건 입력을 대기해준다
        System.out.println("w4 = " + w4);

        // \n -> 일종의 문자임
        int i = sc.nextInt(); // 숫자로 알아서 변환되어서 받을 수 있음 -> 100\n => \n.
        System.out.println("i = " + i);
        // 전체 줄을 인식
        String line = sc.nextLine(); // 엔터까지를 다 읽음
        System.out.println("line = " + line);
        System.out.println("종료");

        sc.close();
    }
}