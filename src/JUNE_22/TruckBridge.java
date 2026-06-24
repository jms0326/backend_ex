package JUNE_22;

/**
   문제: 다리를 지나는 트럭 (Programmers Lv. 2)

   문제를 스스로 풀이하기 힘들어 구글링의 도움을 받았습니다.

   큐를 활용하여 문제를 접근하여 문제 이해하는 것까지는 성공을 하였으나,
   큐를 활용하여 문제를 풀어본 경험이 없어 잘못된 방식으로 접근했습니다.
   큐 활용 문제일 경우 처음 접근 방식이 궁금합니다.
   구글링과 AI 도움을 받아 코드를 이해해보려 했으나, 다시 혼자 테스트를 진행해보아도 큐 문제는 어려운거
   같습니다.

 */
import java.util.ArrayDeque;
import java.util.Queue;

public class TruckBridge {

    public static int solution_que(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new ArrayDeque<>();
        int time = 0;
        int currentBridgeWeight = 0;

        // 다리 길이만큼 큐를 0으로 채워 '빈 다리' 만들기
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        int truckIndex = 0;

        while (truckIndex < truck_weights.length) {
            time++;

            currentBridgeWeight -= bridge.poll();

            int nextTruck = truck_weights[truckIndex];

            if (currentBridgeWeight + nextTruck <= weight) {
                bridge.offer(nextTruck);
                currentBridgeWeight += nextTruck;
                truckIndex++;
            } else {
                bridge.offer(0);
            }
        }

        return time + bridge_length;
    }
}