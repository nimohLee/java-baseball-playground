package study;

import java.util.List;
import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BallGenerator ballGenerator = new BallGenerator();
        while (true) {
            List<Ball> answerBalls = ballGenerator.generate();
            System.out.print("숫자를 입력해 주세요 : ");
            String input = scanner.nextLine();
            try {
                List<Integer> inputNums = CommonUtil.stringToIntList(input);

            } catch (Exception e) {
                System.out.println("잘못 입력되었습니다. 다시 입력해주세요.");
            }

            // success (end)
            boolean isSuccess = false;
            if (isSuccess) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");

                int exitGame = scanner.nextInt();
                if (exitGame == 2) {
                    System.exit(0);
                }
            }
        }
    }
}
