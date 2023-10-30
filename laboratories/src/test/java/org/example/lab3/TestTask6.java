package org.example.lab3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestTask6 {
    @ParameterizedTest
    @DisplayName("A test of a method that checks whether a number presented as a linked list has doubled.")
    @MethodSource("provideTestData")
    void testDoubleNum(MyList<Integer> list, Integer[] expected){
        Task6.doubleNum(list);

        assertThat(list.toArray())
                .isNotNull()
                .containsExactly(expected);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new MyList<>(1,8,9), new Integer[]{3,7,8}),
                Arguments.of(new MyList<>(9,9,9), new Integer[]{1,9,9,8})
        );
    }
}
