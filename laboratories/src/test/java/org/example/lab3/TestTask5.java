package org.example.lab3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestTask5 {
    @ParameterizedTest
    @DisplayName("Checking the method that checks if a node is removed from the list.")
    @MethodSource("provideTestData")
    void testRemoveElement(MyList<Integer> list, Integer element, Integer[] expected){
        Task5.removeElement(list, element);

        assertThat(list.toArray())
                .isNotNull()
                .containsExactly(expected);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new MyList<>(4,5,1,9), 5, new Integer[]{4,1,9}),
                Arguments.of(new MyList<>(4,5,1,9), 1, new Integer[]{4,5,9})
        );
    }
}
