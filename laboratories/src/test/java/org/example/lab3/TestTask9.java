package org.example.lab3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestTask9 {
    @ParameterizedTest
    @DisplayName("Check method that checks if the list has been split.")
    @MethodSource("provideTestData")
    void testSplitList(MyList<Integer> list, int x, Integer[] expected){
        Task9.splitList(list, x);

        assertThat(list.toArray())
                .isNotNull()
                .containsExactly(expected);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new MyList<>(1, 4, 3, 2, 5, 2), 3, new Integer[]{1, 2, 2, 4, 3, 5}),
                Arguments.of(new MyList<>(2, 1), 2, new Integer[]{1, 2})
        );
    }
}
