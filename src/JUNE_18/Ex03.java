package JUNE_18;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        // array
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        System.out.println(i1 + " " + i2 + " " + i3);
//        int[] arr1;
//        arr1 = new int[3]; // 선언과 할당이 나눠져 있음
        int[] arr1 = new int[3]; // 배열 초기화;
        // 할당이 되면 더 이상 길이를 바꿀 수 X. (그 할당된 배열은.)
        // 새롭게 다른 아예 새로운 배열을 할당함으로 대체할 순 있음.
        System.out.println("arr1 = " + arr1);
        arr1 = new int[5];
        System.out.println("arr1 = " + arr1); // immutable -> 대체
        int arr2[] = new int[10]; // 이것도 되긴 하는데 권장은 아님
        System.out.println("arr1[0] = " + arr1[0]); // 기본값 0.
        arr1[0] = 10; // 대입, 수정, 호출 -> 인덱스.
        System.out.println("arr1[0] = " + arr1[0]);
        System.out.println("arr1.length = " + arr1.length);
        // 인덱스는 0부터 시작하기 때문에 일반적으로 호출 가능한 인덱스는 length - 1
//        System.out.println("arr1[arr1.length] = " + arr1[arr1.length]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // <= arr.length - 1, < arr.length
        // 배열을 그냥 찍으면 객체의 해시값이 나옴
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        // 배열 리터럴 {}
        int[] arr3 = {1, 2, 3};
        System.out.println(Arrays.toString(arr3));
        // 다중배열 선언, 인덱스 호출, toString
//        int[][] arr4 = new int[2][3]; // 앞에 있는게 밖을 감싸는 형태
        // 2개 -> (3개)를 반복하는 형태
        int[][] arr4 = new int[2][3];
        arr4[0][1] = 100;
        arr4[1][2] = 200;
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.deepToString(arr4));
        int[][] arr5 = {{1, 2, 3}, {2, 4, 5}};
        System.out.println(Arrays.deepToString(arr5));
    }
}