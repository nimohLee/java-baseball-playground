package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCalculator {
    public static int calculate() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        List<String> operatorList = new ArrayList<>();

        while(true) {
            // 2 + 3 * 4 / 2
            String expression = scanner.nextLine();
            String[] expressionArr = expression.split(" ");

            // 숫자 리스트와 연산자 리스트로 나누기
            for (int i = 0; i < expressionArr.length; i++) {
                if ( isNumber(expressionArr[i]) ) {
                    numberList.add(Integer.parseInt(expressionArr[i]));
                    continue;
                }
                operatorList.add(expressionArr[i]);
            }

            if (numberList.size() > operatorList.size()) {
                break;
            }

            // 연산자 개수가 숫자 개수와 같거나 많은 경우 잘못된 식임 (ex. 1 + 3 + )
            System.out.println("잘못된 식입니다. 다시 입력해주세요.");
        }

        int result = numberList.get(0);
        for (int i = 1; i < numberList.size(); i++) {

            int nextNum = numberList.get(i);
            String operator = operatorList.get(i-1);

            if (operator.equals("+")) {
                result += nextNum;
                continue;
            }
            if (operator.equals("-")) {
                result -= nextNum;
                continue;
            }
            if (operator.equals("*")) {
                result *= nextNum;
                continue;
            }
            result /= nextNum;

        }

        return result;
    }

    private static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
