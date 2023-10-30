package org.example.lab3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestTask7 {
    @ParameterizedTest
    @DisplayName("A method check that checks whether k sorted lists have been merged.")
    @MethodSource("provideTestData")
    void testCreateList(Integer[][] matrix, Integer[] expected){
        MyList<Integer> list = Task7.createList(matrix);

        assertThat(list.toArray())
                .isNotNull()
                .containsExactly(expected);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new Integer[][]{{1, 4, 5}, {1, 3, 4}, {2, 6}}, new Integer[]{1, 1, 2, 3, 4, 4, 5, 6}),
                Arguments.of(new Integer[][]{}, new Integer[]{}),
                Arguments.of(new Integer[][]{{}}, new Integer[]{})
        );
    }
}
