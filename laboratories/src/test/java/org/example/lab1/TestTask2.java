package org.example.lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.example.lab1.Task2.Node;

class TestTask2 {
    private Task2 task2;

    @BeforeEach
    void createObject(){
        task2 = new Task2();
    }

    @Test
    @DisplayName("Checking the change of two items if the list consists of paired items.")
    void testSwapPaired(){
        Node head = new Node(1, new Node(2, new Node(3, new Node(4))));
        Node expected = new Node(2, new Node(1, new Node(4, new Node(3))));

        head = task2.swap(head);

        assertIterableEquals(expected, head);
    }

    @Test
    @DisplayName("Checking the change of two items if the list consists of odd items.")
    void testSwapOdd(){
        Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));
        Node expected = new Node(2, new Node(1, new Node(4, new Node(3, new Node(5)))));

        head = task2.swap(head);

        assertIterableEquals(expected, head);
    }

    @Test
    @DisplayName("Check if the list is empty.")
    void testSwapNull(){
        Node head = null;
        Node expected = null;

        task2.swap(head);

        assertIterableEquals(expected, head);
    }

    @Test
    @DisplayName("Checking if it consists of one element")
    void testSwapOneElement(){
        Node head = new Node(1);
        Node expected = new Node(1);

        task2.swap(head);

        assertIterableEquals(expected, head);
    }
}
