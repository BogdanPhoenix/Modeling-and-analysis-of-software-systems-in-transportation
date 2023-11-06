package org.example.lab4.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask7 {
    @ParameterizedTest
    @DisplayName("Checking a method that returns a bounded sum of a subsequence.")
    @MethodSource("provideTestData")
    void testLimitedAmountSubsequence(Integer[] nums, Integer k, int expected){
        var actual = Task7.limitedAmountSubsequence(nums, k);

        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new Integer[]{10,2,-10,5,20}, 2, 37),
                Arguments.of(new Integer[]{-1,-2,-3}, 1, -1),
                Arguments.of(new Integer[]{10,-2,-10,-5,20}, 2, 23)
        );
    }
}
