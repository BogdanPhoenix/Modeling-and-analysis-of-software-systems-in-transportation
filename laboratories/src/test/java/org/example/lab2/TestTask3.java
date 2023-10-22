package org.example.lab2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestTask3 {
    @ParameterizedTest
    @DisplayName("Checking a function that returns an array of squares of each number sorted in ascending order.")
    @MethodSource("provideTestData")
    void testSortAndReturnArraySquaresEachNum(int[] input, int[] output){
        Task3.sortAndReturnArraySquaresEachNum(input);

        assertThat(input)
                .isNotNull()
                .isNotEmpty()
                .containsExactly(output);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new int[]{-4, -1, 0, 3, 10}, new int[]{0, 1, 9, 16, 100}),
                Arguments.of(new int[]{-7, -3, 2, 3, 11}, new int[]{4, 9, 9, 49, 121})
        );
    }
}
