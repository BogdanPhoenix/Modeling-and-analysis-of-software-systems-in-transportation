package org.example.lab3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;

class TestTask1 {
    @ParameterizedTest
    @DisplayName("Checking a method that combines two sorted lists into one sorted list.")
    @MethodSource("provideTestData")
    void testMergeTwoLists(MyList<Integer> headFirst, MyList<Integer> headSecond, Integer[] expected){
        MyList<Integer> actual = Task1.merge(headFirst, headSecond);

        assertThat(actual.toArray())
                .isNotNull()
                .containsExactly(expected);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new MyList<>(1, 2, 4), new MyList<>(1, 3, 4), new Integer[]{1,1,2,3,4,4}),
                Arguments.of(null, null, new Integer[0]),
                Arguments.of(null, new MyList<>(0), new Integer[]{0})
        );
    }
}
