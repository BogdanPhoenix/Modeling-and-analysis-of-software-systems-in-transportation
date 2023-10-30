package org.example.lab3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TestMyList {

    @Nested
    class TestCreateList{
        @ParameterizedTest
        @DisplayName("Checking the creation of a unidirectional linked list.")
        @MethodSource("provideTestDataCreateList")
        void testCreateEmptyList(MyList<Integer> list, int sizeExpected){
            assertNotNull(list);
            assertEquals(sizeExpected, list.size());
        }

        private static Stream<Arguments> provideTestDataCreateList(){
            return Stream.of(
                    Arguments.of(new MyList<Integer>(), 0),
                    Arguments.of(new MyList<>(2, 1), 2)
            );
        }
    }

    @Nested
    class TestGetMethod{
        static MyList<Integer> list;

        @BeforeAll
        static void create(){
            list = new MyList<>(2, 1, 4, 9, 8, 3, 3, 5);
        }

        @Test
        @DisplayName("Check if the item has been retrieved from the head of the list.")
        void testGetFirst_Correct(){
            Integer expected = 2;

            assertNotNull(list);
            assertEquals(expected, list.getFirst());
        }

        @Test
        @DisplayName("Check if an exception is thrown if the item at the head of the list is a dropdown.")
        void testGetFirst_Throw(){
            var list = new MyList<Integer>();

            assertNotNull(list);
            assertThrows(NoSuchElementException.class, list::getFirst);
        }

        @Test
        @DisplayName("Check if the item was received from the end of the list.")
        void testGetLast_Correct(){
            Integer expected = 5;

            assertNotNull(list);
            assertEquals(expected, list.getLast());
        }

        @Test
        @DisplayName("Check if an exception is thrown if the item at the end of the list is missing.")
        void testGetLast_Throw(){
            var list = new MyList<Integer>();

            assertNotNull(list);
            assertThrows(NoSuchElementException.class, list::getLast);
        }

        @Test
        @DisplayName("Check if you can get a value from the list by its index.")
        void testGetByIndex_Correct(){
            int index = 3;
            Integer expected = 9;

            assertNotNull(list);
            assertEquals(expected, list.get(index));
        }

        @Test
        @DisplayName("Check if an exception is thrown if the index is outside the list.")
        void testGetByIndex_Wrong(){
            int index = list.size() + 5;

            assertThrows(IndexOutOfBoundsException.class, () -> list.get(index));
        }
    }

    @Nested
    class TestRemoveMethod{
        MyList<Integer> list;

        @BeforeEach
        void create(){
            list = new MyList<>(2, 1, 4, 9, 8, 3, 0, 5);
        }

        @AfterEach
        void clear(){
            list.clear();
        }

        @Test
        @DisplayName("Check if the item was removed from the list header.")
        void testRemoveFirst_Correct(){
            Integer expectedSize = list.size() - 1;
            Integer prevHead = list.getFirst();

            list.removeFirst();

            assertNotNull(list);
            assertEquals(expectedSize, list.size());
            assertNotEquals(prevHead, list.getFirst());
        }

        @Test
        @DisplayName("Check if an exception is thrown if there is an attempt to delete the first element if it is missing.")
        void testRemoveFirst_Throw(){
            var list = new MyList<Integer>();

            assertNotNull(list);
            assertThrows(NoSuchElementException.class, list::removeFirst);
        }

        @Test
        @DisplayName("Check if the item has been removed from the end of the list.")
        void testRemoveLast_Correct(){
            Integer expectedSize = list.size() - 1;
            Integer prevTail = list.getLast();

            list.removeLast();

            assertNotNull(list);
            assertEquals(expectedSize, list.size());
            assertNotEquals(prevTail, list.getLast());
        }

        @Test
        @DisplayName("Check if an exception is thrown when trying to delete the last element if it is missing.")
        void testRemoveLast_Throw(){
            var list = new MyList<Integer>();

            assertNotNull(list);
            assertThrows(NoSuchElementException.class, list::removeLast);
        }

        @Test
        @DisplayName("A method that checks whether the specified item has been deleted.")
        void testRemoveElement_Correct(){
            Integer expectedSize = list.size() - 1;
            Integer removeElement = 9;

            boolean actual = list.remove(removeElement);

            assertNotNull(list);
            assertTrue(actual);
            assertEquals(expectedSize, list.size());
        }

        @Test
        @DisplayName("Check if an item that is not in the list has been deleted.")
        void testRemoveElement_Wrong(){
            Integer expectedSize = list.size();
            Integer removeElement = 100;

            boolean actual = list.remove(removeElement);

            assertNotNull(list);
            assertFalse(actual);
            assertEquals(expectedSize, list.size());
        }

        @Test
        @DisplayName("Check if the item at the specified index has been deleted from the list.")
        void testRemoveByIndex_Correct(){
            int index = 3;
            Integer expectedSize = list.size() - 1;
            Integer expected = list.get(index);
            Integer actual = list.remove(index);

            assertNotNull(list);
            assertEquals(expected, actual);
            assertEquals(expectedSize, list.size());
        }

        @Test
        @DisplayName("Check if an exception is thrown if the index is outside the list.")
        void testRemoveByIndex_Throw(){
            int index = list.size() + 10;

            assertNotNull(list);
            assertThrows(IndexOutOfBoundsException.class, () -> list.remove(index));
        }
    }

    @Nested
    class TestAddMethod{
        MyList<Integer> list;

        @BeforeEach
        void create(){
            list = new MyList<>(2, 1, 4, 9, 8, 3, 0, 5);
        }

        @AfterEach
        void clear(){
            list.clear();
        }

        @Test
        @DisplayName("Check if the item was added to the list at the specified index.")
        void testAddByIndex_Correct(){
            int add = 10;
            int indexAdd = 4;
            int expectedSize = list.size() + 1;
            Integer[] expected = {2, 1, 4, 9, add, 8, 3, 0, 5};

            list.add(indexAdd, add);

            assertThat(list.toArray())
                    .isNotNull()
                    .hasSize(expectedSize)
                    .containsExactly(expected);
        }

        @Test
        @DisplayName("Check if an exception is thrown if the index is outside the list when adding an item.")
        void testAddByIndex_Throw(){
            int add = 10;
            int indexAdd = list.size() + 10;

            assertNotNull(list);
            assertThrows(IndexOutOfBoundsException.class, () -> list.add(indexAdd, add));
        }

        @Test
        @DisplayName("Check if the array of items was added to the end of the list.")
        void testAddAll_Correct(){
            Integer[] addArray = {1, 3, 4, 6};
            Integer[] expected = {2, 1, 4, 9, 8, 3, 0, 5, 1, 3, 4, 6};

            list.addAll(addArray);

            assertThat(list.toArray())
                    .isNotNull()
                    .hasSize(expected.length)
                    .containsExactly(expected);
        }

        @Test
        @DisplayName("Check if the item was added to the top of the list.")
        void testAddFirstToEmpty_Correct(){
            Integer[] expected = {5};
            MyList<Integer> list = new MyList<>();
            int addElement = 5;

            list.addFirst(addElement);

            assertThat(list.toArray())
                    .isNotNull()
                    .hasSize(expected.length)
                    .containsExactly(expected);
        }

        @Test
        @DisplayName("Check if multiple items have been added one after the other to the beginning of an empty list.")
        void testAddMultElementFirstToEmpty_Correct(){
            Integer[] expected = {5, 8, 6, 6};
            MyList<Integer> list = new MyList<>();

            for(int i = expected.length - 1; i >= 0; --i){
                list.addFirst(expected[i]);
            }

            assertThat(list.toArray())
                    .isNotNull()
                    .hasSize(expected.length)
                    .containsExactly(expected);
        }

        @Test
        @DisplayName("Check if several items were added one after the other to the beginning of a non-empty list.")
        void testAddMultElementFirstToNotEmpty_Correct(){
            Integer[] addArray = {1, 3, 4, 6};
            Integer[] expected = {6, 4, 3, 1, 2, 1, 4, 9, 8, 3, 0, 5};

            for(var element : addArray){
                list.addFirst(element);
            }

            assertThat(list.toArray())
                    .isNotNull()
                    .hasSize(expected.length)
                    .containsExactly(expected);
        }

        @Test
        @DisplayName("Check if the item was added to the end of the list.")
        void testAddLastToEmpty_Correct(){
            Integer[] expected = {5};
            MyList<Integer> list = new MyList<>();
            int addElement = 5;

            list.addLast(addElement);

            assertThat(list.toArray())
                    .isNotNull()
                    .hasSize(expected.length)
                    .containsExactly(expected);
        }
    }

    @Nested
    class TestOtherMethod{
        MyList<Integer> list;

        @BeforeEach
        void create(){
            list = new MyList<>(2, 1, 4, 9, 8, 3, 0, 5);
        }

        @AfterEach
        void clear(){
            list.clear();
        }

        @Test
        @DisplayName("Check if the value of the item in the list has been replaced at the specified index.")
        void testSet_Correct(){
            int indexSet = 4;
            Integer expected = 10;
            Integer prevValue = list.get(indexSet);

            Integer actual = list.set(indexSet, expected);

            assertNotNull(list);
            assertEquals(prevValue, actual);
            assertEquals(expected, list.get(indexSet));
        }

        @Test
        @DisplayName("Check if an exception is thrown if the index is outside the list when the element value is changed.")
        void testSet_Throw(){
            int add = 10;
            int indexAdd = list.size() + 10;

            assertNotNull(list);
            assertThrows(IndexOutOfBoundsException.class, () -> list.set(indexAdd, add));
        }

        @Test
        @DisplayName("Check whether the contents of the array have been cleared.")
        void testClear(){
            int expectedSize = 0;

            list.clear();

            assertNotNull(list);
            assertEquals(expectedSize, list.size());
        }

        @Test
        @DisplayName("Check whether the contents of the array have been cleared.")
        void testToArray(){
            Integer[] expected = {2, 1, 4, 9, 8, 3, 0, 5};

            Object[] actual = list.toArray();

            assertThat(actual)
                    .isNotNull()
                    .isNotEmpty()
                    .hasSize(expected.length)
                    .containsExactly(expected);
        }

        @ParameterizedTest
        @DisplayName("Checking the merge of two unidirectional linked lists.")
        @MethodSource("provideTestDataMerge")
        void testMerge(MyList<Integer> secondList, Integer[] expected){
            list.merge(secondList);
            Object[] actual = list.toArray();

            assertThat(actual)
                    .isNotNull()
                    .isNotEmpty()
                    .hasSize(expected.length)
                    .containsExactly(expected);
        }

        private static Stream<Arguments> provideTestDataMerge(){
            return Stream.of(
                    Arguments.of(new MyList<>(5, 9, 3, 7, 6), new Integer[]{2, 1, 4, 9, 8, 3, 0, 5, 5, 9, 3, 7, 6}),
                    Arguments.of(null, new Integer[]{2, 1, 4, 9, 8, 3, 0, 5}),
                    Arguments.of(new MyList<Integer>(), new Integer[]{2, 1, 4, 9, 8, 3, 0, 5})
            );
        }

        @Test
        @DisplayName("Check if the contents of the array have been sorted.")
        void testSort(){
            Integer[] expected = {0,1,2,3,4,5,8,9};

            list.sort();
            Object[] actual = list.toArray();

            assertThat(actual)
                    .isNotNull()
                    .isNotEmpty()
                    .hasSize(expected.length)
                    .containsExactly(expected);
        }

        @ParameterizedTest
        @DisplayName("Checking the swapping of two items in unidirectional linked lists.")
        @MethodSource("provideTestDataSwap")
        void testSwap(int indexFirst, int indexSecond, Integer[] expected){
            list.swap(indexFirst, indexSecond);
            Object[] actual = list.toArray();

            assertThat(actual)
                    .isNotNull()
                    .isNotEmpty()
                    .hasSize(expected.length)
                    .containsExactly(expected);
        }

        private static Stream<Arguments> provideTestDataSwap(){
            return Stream.of(
                    Arguments.of(3, 3, new Integer[]{2, 1, 4, 9, 8, 3, 0, 5}),
                    Arguments.of(0, 4, new Integer[]{8, 1, 4, 9, 2, 3, 0, 5}),
                    Arguments.of(4, 0, new Integer[]{8, 1, 4, 9, 2, 3, 0, 5}),
                    Arguments.of(0, 1, new Integer[]{1, 2, 4, 9, 8, 3, 0, 5}),
                    Arguments.of(4, 0, new Integer[]{8, 1, 4, 9, 2, 3, 0, 5}),
                    Arguments.of(2, 5, new Integer[]{2, 1, 3, 9, 8, 4, 0, 5}),
                    Arguments.of(5, 2, new Integer[]{2, 1, 3, 9, 8, 4, 0, 5})
            );
        }

        @Test
        @DisplayName("Check that the list is displayed on the screen.")
        void testToString(){
            String expected = "[2, 1, 4, 9, 8, 3, 0, 5]";
            String actual = list.toString();

            assertEquals(expected, actual);
        }
    }
}
