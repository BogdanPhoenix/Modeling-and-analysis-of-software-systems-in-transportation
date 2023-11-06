package org.example.lab4.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask7 {
    @ParameterizedTest
    @DisplayName("Checking the method that returns the length of the longest real brackets.")
    @MethodSource("provideTestData")
    void testLongestValidParentheses(String input, Integer expected){
        var actual = Task7.longestValidParentheses(input);

        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of("(()", 2),
                Arguments.of(")()())", 4),
                Arguments.of("", 0)
        );
    }
}
