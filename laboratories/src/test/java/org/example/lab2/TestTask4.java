package org.example.lab2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestTask4 {
    @ParameterizedTest
    @DisplayName("Test a method that changes an existing array, namely, duplicate each occurrence of zero by shifting the other elements to the right.")
    @MethodSource("provideTestData")
    void testDuplicateEachOccurrenceZero(int[] input, int[] output){
        Task4.duplicateEachOccurrenceZero(input);

        assertThat(input)
                .isNotNull()
                .isNotEmpty()
                .containsExactly(output);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new int[]{1, 0, 2, 3, 0, 4, 5, 0}, new int[]{1, 0, 0, 2, 3, 0, 0, 4}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 3})
        );
    }
}
