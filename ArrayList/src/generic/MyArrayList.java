package generic;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    private T[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private static final double EXTENSION_COEF = 1.5;
    private int capacity;
    private int count = 0;

    public MyArrayList() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
    }

    public void add(T e) {
        elements[count++] = e;
    }

    public T get(int index) {
        return elements[index];
    }

    //число элементов в списке
    int size() {
        return count;
    }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        T[] newElements = (T[]) new Object[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    private boolean thisOrNot(T value) {
        String str = "str";
        Integer intTest = 1;
        boolean test = false;
        if (value.getClass() == elements[0].getClass()) {
            test = true;
        } else {
            test = false;
        }
        return test;
    }

    //есть ли в списке такой элемент
    boolean contains(T value) {
        boolean a = false;
        for (int i = 0; i < count && a == false; i++) {
            if (value == elements[i]) {
                a = true;
            }
        }
        return a;

    }

    //удаление элемента по индекс (со смещением элементов влево)
    void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        for (int i = index + 1; i < elements.length; i++) {
            elements[i - 1] = elements[i];
        }
        count--;
    }

    //возвращает все элементы из списка в виде массива
    T[] toArray() {
        T[] elemToArray = (T[]) new Object[count];
        for (int i = 0; i < count; i++) {
            elemToArray[i] = elements[i];
        }
        return elemToArray;
    }

    //добавление всех элементов из списка list в данный список(в конец)
    void addAll(MyArrayList<T> intList) {
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
        T[] intArray = intList.toArray();
        int j = 0;
        int bufCount = 0;
        for (int i = count; i < count + intList.size(); i++) {
            elements[i] = intArray[j];
            j++;
            bufCount++;
        }
        count+=bufCount;
    }

    //добавление всех элементов из списка list в данный список
    //начиная с позиции index
    void addAll(MyArrayList<T> intList, int startPosition) {
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
        T[] intArray = intList.toArray();
        for (int i = count; i < count + intList.size(); i++) {
            elements[i] = elements[i - startPosition];
        }
        for (int i = startPosition; i < startPosition + intList.size(); i++) {
            elements[i] = intArray[j];
            j++;
            count++;
        }
    }

    public Iterator<T> iterator() {
        return new MyIter();
    }

    public class MyIter implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            return elements[currentIndex++];
        }
    }
}
