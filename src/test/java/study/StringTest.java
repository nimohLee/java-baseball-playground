package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] oneAndTwo = "1,2".split(",");
        String[] onlyOne = "1".split(",");

        assertThat(oneAndTwo).contains("1");
        assertThat(oneAndTwo).containsExactly("1", "2");
        assertThat(onlyOne).containsExactly("1");
    }

    @Test
    void substring() {
        String result = "(1,2)".substring(1, 4); // 시작 포함, 마지막 미포함
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("StrnigIndexOutOfBoundsException 테스트")
    void charAt() {
        assertThatThrownBy(() -> { String testStr = String.valueOf("abc".charAt(3)); }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }



}
