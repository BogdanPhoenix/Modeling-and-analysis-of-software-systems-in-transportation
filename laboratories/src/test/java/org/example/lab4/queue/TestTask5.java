package org.example.lab4.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask5 {
    @ParameterizedTest
    @DisplayName("Checking the method that stamps sequences.")
    @MethodSource("provideTestData")
    void testMovesToStamp(String stamp, String target, Integer[] expected){
        var actual = Task5.movesToStamp(stamp, target);

        Assertions.assertThat(actual).
                isNotNull()
                .hasSize(expected.length)
                .containsExactly(expected);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of("abc", "ababc", new Integer[]{1,0,2}),
                Arguments.of("abc", "abdbc", new Integer[]{}),
                Arguments.of("abca", "aabcaca", new Integer[]{2,3,0,1})
        );
    }
}
