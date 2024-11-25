package at.ac.fhcampuswien.block12.examples.example05;

import java.util.Arrays;

public class ArrayGenericList<E> implements GenericList<E> {
    private E[] elements;
    private int size = 0;

    public ArrayGenericList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0.");
        }

        // cannot create objects of parameterised type!
        // this.elements = new E[capacity];
        this.elements = (E[]) new Object[capacity];  // cast is necessary
    }

    @Override
    public boolean add(E element) {
        if (size >= elements.length) {
            System.out.println("List is full! Cannot add element.");
            return false;
        }

        elements[size++] = element; // add element and increment size

        return true;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        return elements[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
}