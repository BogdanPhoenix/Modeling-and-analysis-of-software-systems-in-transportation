package org.example.lab4.stack;

import org.example.lab3.MyList;
import org.example.lab3.Task1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TestTask2 {
    @ParameterizedTest
    @DisplayName("Checking the method that checks the traversal of the tree in the Inorder Traversal order.")
    @MethodSource("provideTestData")
    void testInorderTraversal(TreeNode root, Integer[] expected){
        List<Integer> actual = Task2.inorderTraversal(root);

        assertThat(actual)
                .isNotNull()
                .hasSize(expected.length)
                .containsExactly(expected);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)), new Integer[] {1,3,2}),
                Arguments.of(null, new Integer[]{}),
                Arguments.of(new TreeNode(1), new Integer[] {1})
        );
    }
}
