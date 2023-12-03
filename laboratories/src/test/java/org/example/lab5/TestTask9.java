package org.example.lab5;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask9 {
    @ParameterizedTest
    @DisplayName("A validation method that checks the method that performs a vertical traversal of the binary tree.")
    @MethodSource("provideTestData")
    void testVerticalOrder(String traversal, TreeNode expected){
        var actual = Task9.recoverFromPreorder(traversal);

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    private static @NotNull Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of("1-2--3--4-5--6--7",
                    new TreeNode(1,
                            new TreeNode(2,
                                    new TreeNode(3),
                                    new TreeNode(4)
                            ),
                            new TreeNode(5,
                                    new TreeNode(6),
                                    new TreeNode(7)
                            )
                    )
                ),
                Arguments.of("1-2--3---4-5--6---7",
                    new TreeNode(1,
                            new TreeNode(2,
                                    new TreeNode(3,
                                            new TreeNode(4),
                                            null
                                    ),
                                    null
                            ),
                            new TreeNode(5,
                                    new TreeNode(6,
                                            new TreeNode(7),
                                            null
                                    ),
                                    null
                            )
                    )
                ),
                Arguments.of( "1-401--349---90--88",
                    new TreeNode(1,
                            new TreeNode(401,
                                    new TreeNode(349,
                                            new TreeNode(90),
                                            null
                                    ),
                                    new TreeNode(88)
                            ),
                            null
                    )
                )
        );
    }
}
