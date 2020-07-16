package collections.my_lists.arraylist;


public class myArrayList<E> {
    private Object[] array; //скрытый массив (внутри аррайлист)
    private int size;//размер аррайлиста
    public static final int DEFAULT_CAPACITY = 10;

    public myArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public boolean add(Object o) {
        if (size >= array.length) {
            Object[] resArray = new Object[3 * 2 * size + 1];
            System.arraycopy(array, 0, resArray, 0, size);
            array = resArray;
        }
        array[size++] = o;
        return true;
    }

    private void shiftToLeft(int start) {
        size--;
        if (size <= 0) {
            return;
        }
        if (size != start) {
            System.arraycopy(array, start + 1, array, start, size - start);
        }
        array[size] = null;
    }

    public boolean remove(Object o) {
        if ((size == 0)) {
            return false;
        }
        int i;
        for (i = 0; i < size; i++) {
            if (array[i] == null && o == null) {
                break;
            }
            if ((array[i] != null) && (array[i].equals(o))) {
                System.out.println("Элемент: " + o + " удален");
                break;
            }
        }
        if (i < size) {
            shiftToLeft(i);
            return true;
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
        System.out.println("ArrayList очищен");
    }

    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            System.err.println("Введите корректный индекс");
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        return array[index] = element;
    }

    public void add(int index, Object element) {
        if (size >= array.length) {
            size++;
            Object[] resArray = new Object[3 * 2 * size + 1];
            System.arraycopy(array, 0, resArray, 0, index);
            System.arraycopy(array, index, resArray, index + 1, size - index);
            array = resArray;
            array[index] = element;
        }
        size++;
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        System.out.println("Элемент: " + element + ", успешно добавлен");
    }

    public E remove(int index) {
        Object o = null;
        if ((index < size) && (index >= 0)) {
            o = get(index);
            shiftToLeft(index);
        }
        System.out.println("Элемент с индексом " + index + " успешно удален");
        return (E) o;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(array[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    lastIndex = i;
                }
            }
            return lastIndex;
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(array[i])) {
                    lastIndex = i;
                    System.out.println("Индекс искомого элемента: " + i);
                } else {
                    System.out.println("Такого элемента в массиве нет");
                }
            }
        }
        return lastIndex;
    }

    public myArrayList subList(int fromIndex, int toIndex) {
        checkIndex(fromIndex);
        checkIndex(toIndex);
        myArrayList arrayList = new myArrayList();
        for (int i = fromIndex; i < toIndex; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyArrayList{ ");
        for (int i = 0; i < size; i++) {
            sb.append(array[i].toString()).append(" ");
        }
        sb.append("}");
        return sb.toString();
    }
}

