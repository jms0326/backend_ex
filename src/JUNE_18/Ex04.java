package JUNE_18;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        // 배열 + for => for Each
        String[] arr = {"apple", "banana", "cherry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int idx = arr.length - 1 - i;
//            System.out.println("i = " + (arr.length - 1 - i));
//            System.out.println("arr[" + (arr.length - 1 - i) + "] = " + arr[arr.length - 1 - i]);
            System.out.println("idx = " + idx);
            System.out.println("arr[idx] = " + arr[idx]);
        }
        // 이중포문 -> 이중배열
        boolean[][] matrix = {
                // j 0 1 2 3 4
                {true, false, false, false, false}, // i = 0
                {true, true, true, true, true}, // i = 1
                {false, false, false, false, true} // // i = 2
        };
        System.out.println("Arrays.deepToString(matrix) = " + Arrays.deepToString(matrix));
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("i = " + i);
            System.out.println("Arrays.toString(matrix[i] = " + Arrays.toString(matrix[i]));
//            for (int j = 0; j < matrix[i].length; j++) {
            for (int j = 0; j < matrix[0].length; j++) { // 이중 이상의 배열이더라도 배열은 같이 속한 단계의 길은 모두 일치
                System.out.println("i = " + i + " j = " + j);
                System.out.println("matrix[i][j] = " + matrix[i][j]);
            }
        }
    }
}