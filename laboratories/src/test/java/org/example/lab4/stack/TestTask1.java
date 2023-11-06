package org.example.lab4.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class TestTask1 {
    @ParameterizedTest
    @DisplayName("Checking a method that checks the entered string for validity.")
    @MethodSource("provideTestData")
    void testValidBrackets(String line, boolean expected){
        boolean actual = Task1.validBrackets(line);

        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("()[}{}", false),
                Arguments.of("(]", false)
        );
    }
}
