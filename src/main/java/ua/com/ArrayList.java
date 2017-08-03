package ua.com;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Alexandr on 04.08.2017.
 */
public class ArrayList<T> implements List {

    T elementData[];
    int size;

    public ArrayList() {
        elementData = (T[]) new Object[0];
        this.size = 0;
    }

    public ArrayList(int size) {
        elementData = (T[]) new Object[size];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public void ensureCapacity(int increasedSize) {
        if (increasedSize > elementData.length) {
            int newSize = (int) (size() * 3) / 2 + 1;
            T[] newElementData = (T[]) new Object[newSize];
            System.arraycopy(elementData, 0, newElementData, 0, size);
            elementData = newElementData;
            System.out.println("Worked ensureCapacity! New length is: " + newSize);
            System.out.println();
        }
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(Object o) {
        for(T obj : elementData) {
            if (obj.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        ensureCapacity(size() + 1);
        elementData[size++] = (T)o;
        return true;
    }

    public boolean remove(Object o) {
        System.out.println("Sorry, you can't use it");
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void clear() {
        System.out.println("Sorry, you can't use it");
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {
        if (index >= elementData.length) {
            System.out.println("Index is bigger than length of an array");
            return;
        }
        ensureCapacity(size() + 1);
        System.arraycopy(elementData, index, elementData, index + 1, elementData.length - index - 1);
        elementData[index] = (T)element;
        size++;
    }

    public Object remove(int index) {
        System.out.println("Sorry, you can't use it");
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        ArrayList array = new ArrayList();
        return null;
    }

    public boolean retainAll(Collection c) {
        System.out.println("Sorry, you can't use it");
        return false;
    }

    public boolean removeAll(Collection c) {
        System.out.println("Sorry, you can't use it");
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
