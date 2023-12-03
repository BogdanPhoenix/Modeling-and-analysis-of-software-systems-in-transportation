package org.example.lab5;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class TestTask8 {
    @ParameterizedTest
    @DisplayName("A validation method that checks the method that performs a vertical traversal of the binary tree.")
    @MethodSource("provideTestData")
    void testVerticalOrder(TreeNode root, List<List<Integer>> expected){
        var actual = Task8.verticalOrder(root);

        Assertions.assertEquals(expected, actual);
    }

    private static @NotNull Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new TreeNode(3,
                        new TreeNode(9),
                        new TreeNode(20,
                                new TreeNode(15),
                                new TreeNode(7)
                        )
                ), List.of(
                        List.of(9),
                        List.of(3, 15),
                        List.of(20),
                        List.of(7)
                )),
                Arguments.of(new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(4),
                                new TreeNode(5)
                        ),
                        new TreeNode(3,
                                new TreeNode(6),
                                new TreeNode(7)
                        )
                ), List.of(
                        List.of(4),
                        List.of(2),
                        List.of(1, 5, 6),
                        List.of(3),
                        List.of(7)
                )),
                Arguments.of(new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(4),
                                new TreeNode(6)
                        ),
                        new TreeNode(3,
                                new TreeNode(5),
                                new TreeNode(7)
                        )
                ), List.of(
                        List.of(4),
                        List.of(2),
                        List.of(1, 5, 6),
                        List.of(3),
                        List.of(7)
                ))
        );
    }
}
