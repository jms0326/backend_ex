package JUNE_19;

// 카펫 깔기
import java.util.*;

public class Solution02 {
    public int[] solution(int brown, int yellow) {
        System.out.println("brown = " + brown);
        System.out.println();

        int[] answer = new int[2];

        // TODO: 이곳에 풀이 코드를 작성하세요.

        return answer;
    }

    public static void main(String[] args) {
        Solution02 sol = new Solution02();

        // 테스트 케이스 1
        int brown1 = 10;
        int yellow1 = 2;
        System.out.println(Arrays.toString(sol.solution(brown1, yellow1))); // 정답 예시: [4, 3]

        // 테스트 케이스 2
        int brown2 = 8;
        int yellow2 = 1;
        System.out.println(Arrays.toString(sol.solution(brown2, yellow2))); // 정답 예시: [3, 3]

        // 테스트 케이스 3
        int brown3 = 24;
        int yellow3 = 24;
        System.out.println(Arrays.toString(sol.solution(brown3, yellow3))); // 정답 예시: [8, 6]
    }
}