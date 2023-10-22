package org.example.lab2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;

class TestTask9 {
    @ParameterizedTest
    @DisplayName("Test a method that replaces elements with the largest element on the right side.")
    @MethodSource("provideTestData")
    void testReplacesElements(int[] input, int[] output){
        Task9.replacesElements(input);

        assertThat(input)
                .isNotNull()
                .isNotEmpty()
                .containsExactly(output);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new int[]{17, 18, 5, 4, 6, 1}, new int[]{18, 6, 6, 6, 1, -1}),
                Arguments.of(new int[]{400}, new int[]{-1}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{5, 5, 5, 5, -1}),
                Arguments.of(new int[]{9, 2, 5, 8, 3}, new int[]{8, 8, 8, 3, -1}),
                Arguments.of(new int[]{10, 7, 5, 3, 1}, new int[]{7, 5, 3, 1, -1})
        );
    }
}
