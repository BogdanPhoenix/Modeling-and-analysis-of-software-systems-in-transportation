package org.example.lab3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList<E> {
    private int size;
    private Node<E> head;
    private Node<E> tail;

    public MyList() {
        size = 0;
        head = null;
        tail = null;
    }

    @SafeVarargs
    public MyList(E... values) {
        this();
        addAll(values);
    }

    public E getFirst() {
        Node<E> first = head;

        if (first == null) {
            throw new NoSuchElementException();
        }

        return first.value;
    }

    public E getLast() {
        Node<E> last = tail;

        if (last == null) {
            throw new NoSuchElementException();
        }

        return last.value;
    }

    public E get(int index) {
        checkElementIndex(index);
        return node(index).value;
    }

    public E removeFirst() {
        Node<E> first = head;

        if (first == null){
            throw new NoSuchElementException();
        }

        E element = head.value;
        Node<E> next = head.next;
        head = next;

        if (next == null){
            tail = null;
        }

        size--;
        return element;
    }

    public E removeLast() {
        Node<E> last = tail;

        if (last == null){
            throw new NoSuchElementException();
        }

        E element = tail.value;
        Node<E> prev = node(size - 2);
        tail = prev;

        if (prev == null) {
            head = null;
        }
        else {
            prev.next = null;
        }

        size--;
        return element;
    }

    public boolean remove(E element) {
        int index = 0;
        Node<E> current = head;

        while (current != null){
            if (element.equals(current.value)){
                remove(index);
                return true;
            }
            current = current.next;
            ++index;
        }

        return false;
    }

    public E remove(int index) {
        checkElementIndex(index);

        Node<E> currentNode = node(index);
        Node<E> nextNode = currentNode.next;
        Node<E> prevNode = node(index - 1);
        E element = currentNode.value;

        if(currentNode == head){
            removeFirst();
            return element;
        }

        if(prevNode == null){
            head = nextNode;
        }
        else {
            prevNode.next = nextNode;
        }

        if(nextNode == null){
            tail = nextNode;
        }
        else {
            currentNode.next = null;
        }

        currentNode.value = null;

        --size;
        return element;
    }

    public void add(int index, E element) {
        checkPositionIndex(index);

        if(index == 0){
            addFirst(element);
        }
        else if (index == size){
            addLast(element);
        }
        else{
            addBefore(index, element);
        }
    }

    @SafeVarargs
    public final void addAll(E... values) {
        for (var element : values){
            addLast(element);
        }
    }

    public void addFirst(E element) {
        Node<E> first = head;
        Node<E> newNode = new Node<>(element, first);
        head = newNode;

        if (first == null){
            tail = newNode;
        }

        size++;
    }

    private void addBefore(int index, E element) {
        Node<E> peak = node(index);
        Node<E> pred = node(index - 1);
        Node<E> newNode = new Node<>(element, peak);

        if (pred == null){
            head = newNode;
        }
        else{
            pred.next = newNode;
        }

        size++;
    }

    public void addLast(E element) {
        Node<E> last = tail;
        Node<E> newNode = new Node<>(element);
        tail = newNode;

        if (last == null) {
            head = newNode;
        }
        else {
            last.next = newNode;
        }

        size++;
    }

    public E set(int index, E element) {
        checkElementIndex(index);

        Node<E> current = node(index);
        E oldVal = current.value;
        current.value = element;

        return oldVal;
    }

    public int size() {
        return size;
    }

    public void clear() {
        Node<E> node = head;

        while (node != null){
            Node<E> next = node.next;
            node.clear();
            node = next;
        }

        head = tail = null;
        size = 0;
    }

    private Node<E> node(int index) {
        Node<E> peak = head;

        for (int i = 0; i < index; i++) {
            peak = peak.next;
        }

        return peak;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void merge(MyList<E> list){
        if(list == null){
            return;
        }

        tail.next = list.head;

        if(list.tail != null){
            tail = list.tail;
        }

        size += list.size();
    }

    public void sort(){
        Object[] objects = toArray();
        quickSort(objects, 0, objects.length - 1);

        for(int i = 0; i < objects.length; ++i){
            set(i, ((E)objects[i]));
        }
    }

    private static <T> void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static <T> int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            int compare = ((Comparable<T>)arr[j]).compareTo(pivot);
            if (compare < 0) {
                swapSort(arr, ++i, j);
            }
        }
        swapSort(arr, ++i, high);
        return i;
    }

    private static <T> void swapSort(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;

        for (Node<E> x = head; x != null; x = x.next) {
            result[i++] = x.value;
        }

        return result;
    }

    public Iterator<E> iterator() { return new MyLisetIterator(); }

    public void swap(int indexFirst, int indexSecond){
        if (indexFirst == indexSecond) {
            return;
        }

        if(indexFirst == 0){
            swapFirst(indexSecond);
        }
        else if(indexSecond == 0){
            swapFirst(indexFirst);
        }
        else if(indexFirst < indexSecond){
            swapElement(indexFirst, indexSecond);
        }
        else {
            swapElement(indexSecond, indexFirst);
        }
    }

    private void swapFirst(int indexSecond){
        Node<E> secondPrev = node(indexSecond - 1);
        Node<E> second = node(indexSecond);
        Node<E> secondNext = second.next;

        Node<E> first = head;

        if(first.next == second){
            first.next = secondNext;
            second.next = first;
        }
        else {
            second.next = first.next;
            first.next = secondNext;
            secondPrev.next = first;
        }

        head = second;
    }

    private void swapElement(int indexFirst, int indexSecond){
        Node<E> firstNode = node(indexFirst);
        Node<E> secondNode = node(indexSecond);

        Node<E> firstNext = firstNode.next;
        Node<E> secondNext = secondNode.next;

        Node<E> firstPrev = node(indexFirst - 1);
        Node<E> secondPrev = node(indexSecond - 1);

        if(indexFirst == indexSecond - 1){
            firstNode.next = secondNext;
            secondNode.next = firstNode;
            firstPrev.next = secondNode;
        }
        else {
            firstPrev.next = secondNode;
            secondNode.next = firstNext;

            secondPrev.next = firstNode;
            firstNode.next = secondNext;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Iterator<E> iterator = iterator();

        builder.append("[");

        while (iterator.hasNext()){
            builder.append(builder.length() == 1 ? "" : " ");
            builder.append(iterator.next());
            builder.append(",");
        }

        if(builder.length() > 1){
            builder.deleteCharAt(builder.length() - 1);
        }

        builder.append("]");

        return builder.toString();
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    private void checkPositionIndex(int index) {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    private class MyLisetIterator implements Iterator<E>{
        private Node<E> next;
        private int nextIndex;

        MyLisetIterator(){
            next = head;
            nextIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Node<E> lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.value;
        }
    }

    private static class Node<E> {
        E value;
        Node<E> next;

        Node(E value) {
            this(value, null);
        }

        Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        void clear(){
            this.value = null;
            this.next = null;
        }
    }
}
