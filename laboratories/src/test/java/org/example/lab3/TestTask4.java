package org.example.lab3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestTask4 {
    @ParameterizedTest
    @DisplayName("Checking the method that reorders the list.")
    @MethodSource("provideTestData")
    void testRearrangeList(MyList<Integer> list, Integer[] expected){
        Task4.rearrangeList(list);

        assertThat(list.toArray())
                .isNotNull()
                .containsExactly(expected);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new MyList<>(1, 2, 3, 4), new Integer[]{1,4,2,3}),
                Arguments.of(new MyList<>(1), new Integer[]{1}),
                Arguments.of(new MyList<>(1,2), new Integer[]{1,2}),
                Arguments.of(new MyList<>(1,2,3), new Integer[]{1,3,2}),
                Arguments.of(new MyList<>(1,2,3,4,5), new Integer[]{1,5,2,4,3})
        );
    }
}
