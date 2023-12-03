package org.example.lab5;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask6 {
    @ParameterizedTest
    @DisplayName("A validation method that checks the method that calculates the maximum path sum.")
    @MethodSource("provideTestData")
    void testSmallest(TreeNode root, Integer expected){
        var actual = Task6.maxPathSum(root);

        Assertions.assertEquals(expected, actual);
    }

    private static @NotNull Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new TreeNode(1,
                        new TreeNode(2),
                        new TreeNode(3)
                ), 6),
                Arguments.of(new TreeNode(-10,
                                new TreeNode(9),
                                new TreeNode(20,
                                        new TreeNode(15),
                                        new TreeNode(7)
                                )
                        ), 42)
        );
    }
}
