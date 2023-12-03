package org.example.lab5;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask4 {
    @ParameterizedTest
    @DisplayName("A check method that checks whether the k-th smallest value was returned.")
    @MethodSource("provideTestData")
    void testSmallest(TreeNode root, Integer k, Integer expected){
        var actual = Task4.kthSmallest(root, k);

        Assertions.assertEquals(expected, actual);
    }

    private static @NotNull Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4)), 1, 1),
                Arguments.of(new TreeNode(5,
                        new TreeNode(3,
                                new TreeNode(2,
                                        new TreeNode(1),
                                        null),
                                new TreeNode(4)),
                        new TreeNode(6)),
                        3, 3)
        );
    }
}
