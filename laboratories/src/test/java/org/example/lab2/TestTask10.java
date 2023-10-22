package org.example.lab2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestTask10 {
    @ParameterizedTest
    @DisplayName("Test a method that sorts an array by parity.")
    @MethodSource("provideTestData")
    void testSortParity(int[] input, int[] output){
        Task10.sortParity(input);

        assertThat(input)
                .isNotNull()
                .isNotEmpty()
                .containsExactly(output);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new int[]{3, 1, 2, 4}, new int[]{4, 2, 1, 3}),
                Arguments.of(new int[]{0}, new int[]{0})
        );
    }
}
