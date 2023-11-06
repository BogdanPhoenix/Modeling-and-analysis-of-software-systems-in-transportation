package org.example.lab4.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask1 {
    @ParameterizedTest
    @DisplayName("Checking a method that returns the index of the first element that does not repeat.")
    @MethodSource("provideTestData")
    void testFirstUniqueCharacter(String line, Integer expected){
        var actual = Task1.firstUniqueCharacter(line);

        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of("leopard", 0),
                Arguments.of("loveleopard", 2),
                Arguments.of("aabb", -1)
        );
    }
}
