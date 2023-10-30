package org.example.lab3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestTask8 {
    @ParameterizedTest
    @DisplayName("A test of a method that checks whether nodes in a k-group have been unwrapped.")
    @MethodSource("provideTestData")
    void testSwapElement(MyList<Integer> list, int k, Integer[] expected){
        Task8.swapElement(list, k);

        assertThat(list.toArray())
                .isNotNull()
                .containsExactly(expected);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new MyList<>(1,2,3,4,5), 2, new Integer[]{2,1,4,3,5}),
                Arguments.of(new MyList<>(1,2,3,4,5), 3, new Integer[]{3,2,1,4,5})
        );
    }
}
