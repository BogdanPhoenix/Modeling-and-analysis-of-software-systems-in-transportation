package org.example.lab4.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask6 {
    @ParameterizedTest
    @DisplayName("Checking the method that checks the evaluation of reverse Polish notation.")
    @MethodSource("provideTestData")
    void testEvaluateReversePolishNotation(String[] tokens, Integer expected){
        var actual = Task6.evaluateReversePolishNotation(tokens);

        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new String[]{"2","1","+","3","*"}, 9),
                Arguments.of(new String[]{"4","13","5","/","+"}, 6),
                Arguments.of(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}, 22)
        );
    }
}
