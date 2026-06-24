package JUNE_22;

import java.util.ArrayDeque;
import java.util.Deque;

/**
  문제: 올바른 괄호 (Programmers Lv. 2)
  문제 엣지(egde) 케이스 :
     1. 닫는 괄호가 먼저 나오는 경우
     2. 문자열이 홀수인 경우
     3. 여는 괄호가 닫는 괄호보다 많은 경우
     4. 여는 괄호가 마지막에 나오는 경우
 */

/**
     궁금사항 :
   1. 역량 평가 알고리즘 문제 중 2번과 4번 문제가 어려워 풀지 못하였는데 문제와 풀이가 궁금합니다.
 */
public class RightBracket {
    /**
        [for문으로 문제 풀이 , 스택을 배우기 전 해당 문제를 스택/큐가 아닌 for문으로 해결한 풀이입니다.]
        - int형 count 변수를 선언하여
        - 문자열을 순차적으로 탐색하면서 :
        - i번째 문자가 '('라면 +1 하고 ')'라면 -1를 count 변수에 적재
        - 올바르지 않은 괄호가 나오면 count가 0보다 작음으로 return false
        - 문자열 순회가 끝난 후 '('가 많을 경우 count는 > 0 이므로 (count == 0) <- false
        - 올바른 괄호 경우 '(' 와 ')' 의 갯수는 같으므로 (count == 0)  <- true
     */

    /**
        추후 회사 알고리즘 면접에서 해당 문제가 나오다면 문제는 스택으로 푸는 것을 권장하나,
        solution_for 클래스처럼 for문으로 풀어도 문제가 없을지 궁금합니다.
     */

    public static boolean solution_for(String s) {
        boolean answer = false;
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            } else if(s.charAt(i) == ')') {
                count--;
            }
            if(count < 0) {
                return false;
            }
        }
        if(count == 0) answer = true;
        return answer;
    }

    /**
     [스택 활용 문제 풀이]
        스택의 메소드 push() - 추가 , peek() - 맨 위 데이터 확인, pop() - 꺼내고 지우기 활용
        메소드의 경우 구글링 검색을 통해 Stack에서 사용하는 메소드를 찾았습니다.
     */
    /**
        강사님 강의자료에는 Stack 클래스 사용은 전면 지앙하고, ArrayDeque를 권장  작성이 되어 있는데
        ArrayDeque와 Stack에 차이를 명확하게 이해하지 못했습니다.
     */
    public static boolean solution_que(String s) {
        Deque<String> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            String data = s.substring(i, i+1);
            if(data.equals("(")) {
                stack.push("(");
            } else if(stack.isEmpty()) {
                return false;
            } else if(stack.peek().equals("(")){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}