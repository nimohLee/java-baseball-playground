package study;

import java.util.ArrayList;
import java.util.List;

public class CommonUtil {
    public static List<Integer> stringToIntList(String input) {
        char[] chars = input.toCharArray();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            result.add((int) chars[i]);
        }
        return result;
    }
}
