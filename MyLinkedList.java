package Dz3;

import java.util.*;
public class MyLinkedList {
    public static void main(String[] args) {
        class LinkedList<E>
                extends AbstractSequentialList<E>
                implements List<E>, Deque<E>, Cloneable, java.io.Serializable
        {
            transient int size = 0;


            /**
             * Constructs an empty list.
             */
            //Создает пустой список.
            public LinkedList() {
            }

            @Override
            public ListIterator<E> listIterator(int index) {
                return null;
            }

            /**
             * Constructs a list containing the elements of the specified
             * collection, in the order they are returned by the collection's
             * iterator.
             *
             * @param  c the collection whose elements are to be placed into this list
             * @throws NullPointerException if the specified collection is null
             */
            //Создает список, содержащий элементы указанного
            //  коллекция, в том порядке, в котором они возвращаются владельцем коллекции
            //  итератор.
            //
            // @param c коллекция, элементы которой должны быть помещены в этот список
            //  @выдает исключение NullPointerException, если указанная коллекция равна нулю
            //
            public LinkedList(Collection<? extends E> c) {
                this();
                addAll(c);
            }


            @Override
            public void addFirst(E e) {

            }

            @Override
            public void addLast(E e) {

            }


            /**
             * Returns {@code true} if this list contains the specified element.
             * More formally, returns {@code true} if and only if this list contains
             * at least one element {@code e} such that
             * {@code Objects.equals(o, e)}.
             *
             * @param o element whose presence in this list is to be tested
             * @return {@code true} if this list contains the specified element
             */
            //Возвращает {@code true}, если этот список содержит указанный элемент.
            //  Более формально, возвращает {@code true} тогда и только тогда, когда этот список содержит
            // по крайней мере, один элемент {@code e} такой, что
            // {@code Objects.equals(o, e)}.
            //
            //  @param o элемент, присутствие которого в этом списке должно быть проверено
            // @возвращает {@code true}, если этот список содержит указанный элемент

            public boolean contains(Object o) {
                return indexOf(o) >= 0;
            }

            /**
             * Returns the number of elements in this list.
             */
            //Возвращает количество элементов в этом списке.

            public int size() {
                return size;
            }

            @Override
            public Iterator<E> descendingIterator() {
                return null;
            }

            /**
             * Appends all of the elements in the specified collection to the end of
             * this list, in the order that they are returned by the specified
             * collection's iterator.  The behavior of this operation is undefined if
             * the specified collection is modified while the operation is in
             * progress.  (Note that this will occur if the specified collection is
             * this list, and it's nonempty.)
             *
             * @param c collection containing elements to be added to this list
             * @return {@code true} if this list changed as a result of the call
             * @throws NullPointerException if the specified collection is null
             */
            //Добавляет все элементы из указанной коллекции в конец
            // этого списка в том порядке, в котором они возвращаются указанным
            //  итератор коллекции. Поведение этой операции не определено, если
            // указанная коллекция изменяется во время выполнения операции
            //  прогресс. (Обратите внимание, что это произойдет, если указанная коллекция
            //  этот список, и он непустой.)
            //
            //  @param c коллекция, содержащая элементы, которые будут добавлены в этот список
            //  @возвращает {@code true}, если этот список изменился в результате вызова
            //  @выдает исключение NullPointerException, если указанная коллекция равна нулю
            //
            public boolean addAll(Collection<? extends E> c) {
                return addAll(size, c);
            }



            /**
             * Tells if the argument is the index of an existing element.
             */
            //Указывает, является ли аргумент индексом существующего элемента.
            private boolean isElementIndex(int index) {
                return index >= 0 && index < size;
            }

            /**
             * Tells if the argument is the index of a valid position for an
             * iterator or an add operation.
             */
            //Указывает, является ли аргумент индексом допустимой позиции для итератора
            // или операции добавления.
            private boolean isPositionIndex(int index) {
                return index >= 0 && index <= size;
            }

            /**
             * Constructs an IndexOutOfBoundsException detail message.
             * Of the many possible refactorings of the error handling code,
             * this "outlining" performs best with both server and client VMs.
             */
            //Создает подробное сообщение IndexOutOfBoundsException.
            // Из многих возможных рефакторингов кода обработки ошибок
            //это "изложение" лучше всего работает как с серверными, так и с клиентскими виртуальными машинами.
            private String outOfBoundsMsg(int index) {
                return "Index: "+index+", Size: "+size;
            }

            private void checkElementIndex(int index) {
                if (!isElementIndex(index))
                    throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
            }

            private void checkPositionIndex(int index) {
                if (!isPositionIndex(index))
                    throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
            }



            /**
             * Retrieves, but does not remove, the head (first element) of this list.
             *
             * @return the head of this list
             * @throws NoSuchElementException if this list is empty
             */
            //Извлекает, но не удаляет заголовок (первый элемент) этого списка.
            //
            //  @возвращает начало этого списка
            //  @вызывает исключение NoSuchElementException, если этот список пуст
            public E element() {
                return getFirst();
            }

            @Override
            public E peek() {
                return null;
            }


            /**
             * Retrieves and removes the head (first element) of this list.
             *
             * @return the head of this list
             * @throws NoSuchElementException if this list is empty
             */
            //Извлекает и удаляет заголовок (первый элемент) этого списка.
            //
            //  @возвращает начало этого списка
            //  @вызывает исключение NoSuchElementException, если этот список пуст
            //
            //
            public E remove() {
                return removeFirst();
            }

            @Override
            public E poll() {
                return null;
            }

            /**
             * Adds the specified element as the tail (last element) of this list.
             *
             * @param e the element to add
             */
            //определяет указанный элемент в качестве хвоста (последнего элемента) этого списка.
            //
            //  @параметр e элемента для добавления

            public boolean offer(E e) {
                return add(e);
            }

            // Deque operations
            //Операции с деком
            /**
             * Inserts the specified element at the front of this list.
             * @param e the element to insert
             */
            //Вставляет указанный элемент в начало этого списка.
            // * @параметр e элемента для вставки
            public boolean offerFirst(E e) {
                addFirst(e);
                return true;
            }

            /**
             * Inserts the specified element at the end of this list.
             * @param e the element to insert
             */
            //возвращает указанный элемент в конец этого списка.
            // @параметр e  элемента для вставки
            public boolean offerLast(E e) {
                addLast(e);
                return true;
            }



            /**
             * Pushes an element onto the stack represented by this list.  In other
             * words, inserts the element at the front of this list.
             * <p>This method is equivalent to {@link #addFirst}.
             * @param e the element to push
             */
            //Помещает элемент в стек, представленный этим списком. В других
            //  слова, вставляет элемент в начало этого списка.
            // <p>Этот метод эквивалентен {@link #addFirst}.
            //  @параметр e элемента для нажатия
            public void push(E e) {
                addFirst(e);
            }

            /**
             * Pops an element from the stack represented by this list.  In other
             * words, removes and returns the first element of this list.
             * <p>This method is equivalent to {@link #removeFirst()}.
             * @return the element at the front of this list (which is the top
             *        of the stack represented by this list)
             * @throws NoSuchElementException if this list is empty
             */
            //Извлекает элемент из стека, представленного этим списком. В других
            //  слова, удаляет и возвращает первый элемент этого списка.
            //  <p>Этот метод эквивалентен {@link #removeFirst()}.
            // @возвращает элемент в начале этого списка (который является верхним
            //  из стека, представленного этим списком)
            //  @вызывает исключение NoSuchElementException, если этот список пуст
            public E pop() {
                return removeFirst();
            }

            /**
             * Removes the first occurrence of the specified element in this
             * list (when traversing the list from head to tail).  If the list
             * does not contain the element, it is unchanged.
             * @param o element to be removed from this list, if present
             * @return {@code true} if the list contained the specified element
             */
            //отображает первое вхождение указанного элемента в этом
            // список (при просмотре списка от начала до конца). Если список
            // не содержит элемента, он остается неизменным.
            // @param o элемент, подлежащий удалению из этого списка, если он присутствует
            //  @возвращает {@code true}, если список содержал указанный элемент
            public boolean removeFirstOccurrence(Object o) {
                return remove(o);
            }

            @Override
            public boolean removeLastOccurrence(Object o) {
                return false;
            }


            @java.io.Serial
            private static final long serialVersionUID = 876323262645176354L;

            @Override
            public E removeFirst() {
                return null;
            }

            @Override
            public E removeLast() {
                return null;
            }

            @Override
            public E pollFirst() {
                return null;
            }

            @Override
            public E pollLast() {
                return null;
            }


            @Override
            public E getFirst() {
                return null;
            }

            @Override
            public E getLast() {
                return null;
            }

            @Override
            public E peekFirst() {
                return null;
            }

            @Override
            public E peekLast() {
                return null;
            }


            @Override
            public LinkedList<E> clone() {
                try {
                    LinkedList clone = (LinkedList) super.clone();
                    // TODO: copy mutable state here, so the clone can't change the internals of the original
                    return clone;
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError();
                }
            }
        }

    }
}







