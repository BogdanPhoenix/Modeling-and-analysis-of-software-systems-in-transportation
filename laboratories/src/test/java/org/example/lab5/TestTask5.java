package org.example.lab5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TestTask5 {
    private final TreeNode expectedRootEmpty = null;
    private final String expectedTreeEmptyValue = "[null]";

    private final TreeNode expectedRoot = new TreeNode(1,
            new TreeNode(2),
            new TreeNode(3,
                    new TreeNode(4),
                    new TreeNode(5)
            )
    );

    private final String expectedTreeValue = "[1, 2, 3, null, null, 4, 5]";

    private Task5 task;

    @BeforeEach
    void create(){
        task = new Task5();
    }

    @Test
    void testSerialize(){
        var actual = task.serialize(expectedRoot);

        assertEquals(expectedTreeValue, actual);
    }

    @Test
    void testSerializeEmpty(){
        var actual = task.serialize(expectedRootEmpty);

        assertEquals(expectedTreeEmptyValue, actual);
    }

    @Test
    void testDeserialize(){
        var actual = task.deserialize(expectedTreeValue);

        assertEquals(expectedRoot.toString(), actual.toString());
    }

    @Test
    void testDeserializeEmpty(){
        var actual = task.deserialize(expectedTreeEmptyValue);

        assertNull(actual);
    }
}
