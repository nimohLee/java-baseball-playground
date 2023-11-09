package study;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BallGenerator ballGenerator = new BallGenerator();
        Referee referee = new Referee();
        List<Ball> answerBalls = ballGenerator.randomGenerate();
        while (true) {
            System.out.print("숫자를 입력해 주세요 : ");
            String input = scanner.nextLine();
                List<Integer> inputNums = CommonUtil.stringToIntList(input);
                List<Ball> inputBalls = ballGenerator.generate(inputNums);
                Map<String, Integer> judgeResult = referee.judge(inputBalls, answerBalls);

            // success (end)
            int strikeCnt = judgeResult.get("strike");
            int ballCnt = judgeResult.get("ball");

            if (strikeCnt == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");

                int exitGame = scanner.nextInt();
                if (exitGame == 2) {
                    System.exit(0);
                }
                answerBalls = ballGenerator.randomGenerate();
                continue;
            }

            if (ballCnt == 0 && strikeCnt == 0) {
                System.out.println("아웃");
                continue;
            }

            if (ballCnt > 0) {
                System.out.print(ballCnt + "볼 ");
            }

            if (strikeCnt > 0) {
                System.out.print(strikeCnt + "스트라이크 ");
            }

            System.out.println();
        }
    }
}
