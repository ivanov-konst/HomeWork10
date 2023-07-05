package Dz3;

import java.util.*;
public class MyArrayList {
    public static void main(String[] args) {


        class MYArrayList<E> extends AbstractList<E>
                implements List<E>, RandomAccess, Cloneable, java.io.Serializable
        {

            @java.io.Serial
            private static final long serialVersionUID = 8683452581122892189L;

            /**
             * Default initial capacity.
             */
            //Начальная емкость по умолчанию.
            private static final int DEFAULT_CAPACITY = 10;

            /**
             * Shared empty array instance used for empty instances.
             */
            //Общий пустой экземпляр массива, используемый для пустых экземпляров.
            private static final Object[] EMPTY_ELEMENTDATA = {};

            /**
             * Shared empty array instance used for default sized empty instances. We
             * distinguish this from EMPTY_ELEMENTDATA to know how much to inflate when
             * first element is added.
             */
            //Общий пустой экземпляр массива, используемый для пустых экземпляров размера по умолчанию. Мы
            // отличаем это от EMPTY_ELEMENTDATA, чтобы знать, сколько нужно раздувать, когда
            //  добавлен первый элемент.
            private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

            /**
             * The array buffer into which the elements of the ArrayList are stored.
             * The capacity of the ArrayList is the length of this array buffer. Any
             * empty ArrayList with elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
             * will be expanded to DEFAULT_CAPACITY when the first element is added.
             */
            //Буфер массива, в котором хранятся элементы ArrayList.
            //  Емкость ArrayList - это длина этого буфера массива. Любой
            // пустой список массивов с elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
            //  будет расширен до DEFAULT_CAPACITY при добавлении первого элемента.
            transient Object[] elementData; // non-private to simplify nested class access

            /**
             * The size of the ArrayList (the number of elements it contains).
             *
             * @serial
             */
            //Размер ArrayList (количество элементов, которые он содержит).
            // *
            // * @серийный номер
            private int size;

            /**
             * Constructs an empty list with the specified initial capacity.
             *
             * @param  initialCapacity  the initial capacity of the list
             * @throws IllegalArgumentException if the specified initial capacity
             *         is negative
             */
            //создает пустой список с указанной начальной емкостью.
            //
            // @param initialCapacity начальная емкость списка
            // @выдает исключение IllegalArgumentException, если указанная начальная емкость
            // является отрицательным
            public MYArrayList(int initialCapacity) {
                if (initialCapacity > 0) {
                    this.elementData = new Object[initialCapacity];
                } else if (initialCapacity == 0) {
                    this.elementData = EMPTY_ELEMENTDATA;
                } else {
                    throw new IllegalArgumentException("Illegal Capacity: " +
                            initialCapacity);
                }
            }

            /**
             * Constructs an empty list with an initial capacity of ten.
             */
            //Создает пустой список с начальной вместимостью десять.
            public MYArrayList() {
                this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
            }

            /**
             * Constructs a list containing the elements of the specified
             * collection, in the order they are returned by the collection's
             * iterator.
             *
             * @param c the collection whose elements are to be placed into this list
             * @throws NullPointerException if the specified collection is null
             */
            //Создает список, содержащий элементы указанного
            //  коллекция, в том порядке, в котором они возвращаются владельцем коллекции
            //  итератор.
            //
            // @param c коллекция, элементы которой должны быть помещены в этот список
            //  @выдает исключение NullPointerException, если указанная коллекция равна нулю
            public MYArrayList(Collection<? extends E> c) {
                Object[] a = c.toArray();
                if ((size = a.length) != 0) {
                    if (c.getClass() == java.util.ArrayList.class) {
                        elementData = a;
                    } else {
                        elementData = Arrays.copyOf(a, size, Object[].class);
                    }
                } else {
                    // replace with empty array.
                    elementData = EMPTY_ELEMENTDATA;
                }
            }

            @Override
            //Переопределение
            public E get(int index) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        }
    }
}