package aston.com.homework_3;

import java.util.Arrays;

public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("неверный индекс");
        }
        return (T) elements[index];
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }


    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("неверный индекс");
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null; // Очищаем последний элемент
    }
    public void sort(MyArrayList myArrayList){
        MyMergeSort.sort(myArrayList);
    }

    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        elements[index] = element;
    }



    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
