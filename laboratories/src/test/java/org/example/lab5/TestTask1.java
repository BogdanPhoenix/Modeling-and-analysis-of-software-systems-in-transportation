package org.example.lab5;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask1 {
    @ParameterizedTest
    @DisplayName("A validation method that checks whether two provided trees are the same.")
    @MethodSource("provideTestData")
    void testSameTree(TreeNode p, TreeNode q, boolean expected){
        var actual = Task1.isSameTree(p, q);

        Assertions.assertEquals(expected, actual);
    }

    private static @NotNull Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new TreeNode(1, new TreeNode(2), new TreeNode(3)), new TreeNode(1, new TreeNode(2), new TreeNode(3)), true),
                Arguments.of(new TreeNode(1, new TreeNode(2), null), new TreeNode(1, null, new TreeNode(2)), false),
                Arguments.of(new TreeNode(1, new TreeNode(2), new TreeNode(1)), new TreeNode(1, new TreeNode(1), new TreeNode(2)), false)
        );
    }
}
