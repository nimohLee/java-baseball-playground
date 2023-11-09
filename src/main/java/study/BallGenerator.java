package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BallGenerator {
    Random random = new Random();

    public List<Ball> generate(List<Integer> numbers) {
        List<Ball> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            result.add(new Ball(i, numbers.get(i)));
        }

        return result;
    }
    public List<Ball> randomGenerate() {
        List<Ball> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Ball ball = new Ball(i, getUniqueRandomBall(result));
            result.add(ball);
        }
        return result;
    }

    private int getUniqueRandomBall(List<Ball> balls) {

        while (true) {
            int randomValue = random.nextInt(9)+1;
            if (isUniqueRandomBall(balls, randomValue)) {
                return randomValue;
            }
        }

    }

    private boolean isUniqueRandomBall(List<Ball> balls, int value) {
        for (Ball ball : balls) {
            if (ball.getValue() == value) {
                return false;
            }
        }
        return true;
    }
}
