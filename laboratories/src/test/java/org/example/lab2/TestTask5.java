package org.example.lab2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestTask5 {
    @ParameterizedTest
    @DisplayName("Test a method that modifies an existing array, namely, combines nums1 and nums2 into one array, sorted in non-descending order.")
    @MethodSource("provideTestData")
    void testUnion(int[] input1, int[] input2, int[] output){
        Task5.union(input1, input2);

        assertThat(input1)
                .isNotNull()
                .isNotEmpty()
                .containsExactly(output);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 0, 0, 0}, new int[]{2, 5, 6}, new int[]{1, 2, 2, 3, 5, 6}),
                Arguments.of(new int[]{1}, new int[]{}, new int[]{1}),
                Arguments.of(new int[]{0}, new int[]{1}, new int[]{1})
        );
    }
}
