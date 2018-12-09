package primitives;

import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        elements = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(int e) {
        boolean a = false;
        for (int i = 0; i < count && a == false; i++) {
            if (e == elements[i]) {
                a = true;
            }
        }
        return a;

    }

    @Override
    public void add(int e) {
        if (capacity == count) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        return elements[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        for (int i = index + 1; i < elements.length; i++) {
            elements[i - 1] = elements[i];
            elements[elements.length] = 0;
        }
        count--;
    }

    @Override
    public void sort() {
        Arrays.sort(elements);
    }

    @Override
    public void addAll(IntList intList) {
        boolean a = true;
        if ((count + intList.size()) > capacity) {
            a = false;
        }
        grow();
        while (a == false) {
            if ((count + intList.size()) > capacity) {
                a = false;
                grow();
            } else {
                a = true;
            }
        }
        int[] intArray = intList.toArray();
        int j = 0;
        int bufCount = 0;
        for (int i = count; i < count + intList.size(); i++) {
            elements[i] = intArray[j];
            j++;
            bufCount++;
        }
        count+=bufCount;
    }

    @Override
    public void addAll(IntList intList, int startPosition) {
        boolean a = true;
        if ((count + intList.size()) > capacity) {
            a = false;
        }
        grow();
        while (a == false) {
            if ((count + intList.size()) > capacity) {
                a = false;
                grow();
            } else {
                a = true;
            }
        }
        int j = 0;
        int[] intArray = intList.toArray();
        for (int i = count; i < count + intList.size(); i++) {
            elements[i] = elements[i - startPosition];
        }
        for (int i = startPosition; i < startPosition + intList.size(); i++) {
            elements[i] = intArray[j];
            j++;
            count++;
        }
    }

    @Override
    public int[] toArray() {
        int[] elemToArray = new int[count];
        for (int i = 0; i < count; i++) {
            elemToArray[i] = elements[i];
        }
        return elemToArray;
    }

    @Override
    public int indexOf(int value) {
        boolean a = false;
        int index = -1;
        for (int i = 0; i < elements.length && a == false; i++) {
            if (value == elements[i]) {
                index = i;
                a = true;
            }
        }
        if (index == -1) {
            throw new IllegalArgumentException("No such element");
        }
        return index;
    }

    @Override
    public Iterator iterator() {
        return new MyIter();
    }

    class MyIter implements Iterator {
        private int currentIndex;

        public MyIter() {
            currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public int next() {
            return elements[currentIndex++];
        }
    }
}

