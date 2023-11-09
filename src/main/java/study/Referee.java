package study;

import java.util.*;

public class Referee {

    public Map<String, Integer> judge(List<Ball> inputBalls, List<Ball> answerBalls) {
        Map<String, Integer> result = new HashMap<>();
        int strikeCnt = 0, ballCnt = 0;

        for (Ball inputBall : inputBalls) {
            for (Ball answerBall : answerBalls) {
                // 숫자가 같고 위치 같으면 S
                if (answerBall.getValue() == inputBall.getValue()) {
                    if (answerBall.getPosition() == inputBall.getPosition()) {
                        strikeCnt++;
                        continue;
                    }
                    // 숫자 같으나 위치 다르면 B
                    ballCnt++;
                }
            }
        }

        result.put("strike", strikeCnt);
        result.put("ball", ballCnt);
        return result;
    }

    public boolean isValid(List<Ball> inputBalls) {
        if (inputBalls.size() > 3) {
            return false;
        }

        for (Ball ball : inputBalls) {
            if (ball.getPosition() < 0 || ball.getPosition() > 2) {
                return false;
            }
            if (ball.getValue() < 0 || ball.getValue() > 9) {
                return false;
            }
        }

        return true;
    }
}
