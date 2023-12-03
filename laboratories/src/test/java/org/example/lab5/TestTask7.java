package org.example.lab5;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask7 {
    @ParameterizedTest
    @DisplayName("A validation method that checks the method that calculates the maximum path sum.")
    @MethodSource("provideTestData")
    void testSmallest(TreeNode root, Integer expected){
        var actual = Task7.minCameraCover(root);

        Assertions.assertEquals(expected, actual);
    }

    private static @NotNull Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new TreeNode(0,
                        new TreeNode(0,
                                new TreeNode(0),
                                new TreeNode(0)
                        ),
                        null
                ), 1),
                Arguments.of(new TreeNode(0,
                        new TreeNode(0,
                                new TreeNode(0,
                                        new TreeNode(0,
                                                null,
                                                new TreeNode(0)),
                                        null
                                ),
                                null
                        ),
                        null
                ), 2)
        );
    }
}
