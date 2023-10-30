package org.example.lab3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestTask2 {
    @ParameterizedTest
    @DisplayName("Checking a method that removes duplicates from a sorted list.")
    @MethodSource("provideTestData")
    void testRemoveDuplicate(MyList<Integer> list, Integer[] expected){
        Task2.removeDuplicate(list);

        assertThat(list.toArray())
                .isNotNull()
                .containsExactly(expected);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new MyList<>(1, 1, 2), new Integer[]{1,2}),
                Arguments.of(new MyList<>(1,1,2,3,3), new Integer[]{1,2,3})
        );
    }
}
