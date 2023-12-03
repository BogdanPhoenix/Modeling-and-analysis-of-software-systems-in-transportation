package org.example.lab5;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class TestTask3 {
    @ParameterizedTest
    @DisplayName("A check method that checks whether the tree has been inverted.")
    @MethodSource("provideTestData")
    void testInvertTree(TreeNode root, String expected){
        var invert = Task3.invertTree(root);

        String actual = invert.toString();
        Assertions.assertEquals(expected, actual);
    }

    private static @NotNull Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new TreeNode(4,
                        new TreeNode(2,
                                new TreeNode(1),
                                new TreeNode(3)),
                        new TreeNode(7,
                                new TreeNode(6),
                                new TreeNode(9)
                        )),
                        "[4, 7, 2, 9, 6, 3, 1]"
                ),
                Arguments.of(new TreeNode(2, new TreeNode(1), new TreeNode(3)), "[2, 3, 1]")
        );
    }
}
