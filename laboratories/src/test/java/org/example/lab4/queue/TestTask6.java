package org.example.lab4.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask6 {
    @ParameterizedTest
    @DisplayName("Checking a method that returns an array of the maximum floating window.")
    @MethodSource("provideTestData")
    void testMaxSlidingWindow(Integer[] nums, Integer k, Integer[] expected){
        var actual = Task6.maxSlidingWindow(nums, k);

        Assertions.assertThat(actual).
                isNotNull()
                .hasSize(expected.length)
                .containsExactly(expected);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new Integer[]{1,3,-1,-3,5,3,6,7}, 3, new Integer[]{3,3,5,5,6,7}),
                Arguments.of(new Integer[]{1}, 1, new Integer[]{1})
        );
    }
}
