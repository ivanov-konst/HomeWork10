import org.jetbrains.annotations.NotNull;

import java.util.*;

public class CatsLinkedList<E> implements List<E> {
    transient Node<E> firstNode;      // первый
    transient Node<E> lastNode;      // следующий
    transient Node<E> previousNode; // предыдущий
    transient int size = 0;
    protected transient int modCount;
    private void linkfirst(E e) {
        final CatsLinkedList.Node<E> f = firstNode;
        final CatsLinkedList.Node<E> newNode = new CatsLinkedList.Node<>(null, e, f);
        firstNode = newNode;
        if (f == null)
            lastNode = newNode;
        else
            f.prev = newNode;
        size++;
        modCount++;
    }

    private void linkLast(E e) {
        final CatsLinkedList.Node<E> l = lastNode;
        final CatsLinkedList.Node<E> newNode = new CatsLinkedList.Node<>(l, e, null);
        lastNode = newNode;
        if (l == null)
            firstNode = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }

    private void linkBefore(E e, CatsLinkedList.Node<E> succ) {
        // assert succ != null;
        final CatsLinkedList.Node<E> pred = succ.prev;
        final CatsLinkedList.Node<E> newNode = new CatsLinkedList.Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            firstNode = newNode;
        else
            pred.next = newNode;
        size++;
        modCount++;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @NotNull
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NotNull
    @Override
    public <T> T[] toArray(@NotNull T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        linkLast(e);
        return true;
    }
    public void addFirst(E e) {
        linkfirst(e);
    }
    public void addLast(E e) {
        linkLast(e);
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, @NotNull Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
             return node(index).item;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    public void add(int index, E element) {
        if (index == size)
            linkLast(element);
        else
            linkBefore(element, node(index));
    }

    @Override
    public E remove(int index) {
                return unlink(node(index));
    }

//    public boolean remove(Object o) {
//        if (o == null) {
//            for (CatsLinkedList.Node<E> x = firstNode; x != null; x = x.next) {
//                if (x.item == null) {
//                    unlink(x);
//                    return true;
//                }
//            }
//        } else {
//            for (CatsLinkedList.Node<E> x = firstNode; x != null; x = x.next) {
//                if (o.equals(x.item)) {
//                    unlink(x);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @NotNull
    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @NotNull
    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @NotNull
    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }


    private static class Node<E> {
        E item;
        CatsLinkedList.Node<E> next;
        CatsLinkedList.Node<E> prev;

        Node(CatsLinkedList.Node<E> prev, E element, CatsLinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    E unlink(CatsLinkedList.Node<E> x) {
        // assert x != null;
        final E element = x.item;
        final CatsLinkedList.Node<E> next = x.next;
        final CatsLinkedList.Node<E> prev = x.prev;

        if (prev == null) {
            firstNode = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            lastNode = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        modCount++;
        return element;
    }

    CatsLinkedList.Node<E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            CatsLinkedList.Node<E> x = firstNode;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            CatsLinkedList.Node<E> x = lastNode;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }
}




