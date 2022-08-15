import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T> {
    private Node<T> head;
    public int count;

    static class Node<T> {
        private Node<T> next;
        private T data;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        newNode.next = head;
        head = newNode;
        count++;
    }

    public void addEnd(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        count++;
    }

    public void addElementOnIndex(int index, T data) {
        incorrectAddOnIndex(index);

        Node<T> newNode = new Node<>(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        count++;
    }

    public T removeFirstElement() {
        checkListIsEmpty();

        T temp = head.data;
        head = head.next;
        count--;

        return temp;
    }

    public T removeLastElement() {
        checkListIsEmpty();
        T old;
        if (head.next == null) {
            old = removeFirstElement();
        } else {
            Node<T> temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            old = temp.next.data;
            temp.next = null;
            count--;
        }
        return old;
    }

    public T removeOnSpecificIndex(int index) {
        incorrectIndex(index);
        checkListIsEmpty();
        T old;

        if (index == 0) {
            old = removeFirstElement();

        } else if (index == count - 1) {
            old = removeLastElement();
        } else {
            Node<T> temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node<T> current = temp.next;
            temp.next = current.next;
            old = current.data;
            count--;
        }

        return old;
    }

    public T set(int index, T data) {
        incorrectIndex(index);

        Node<T> current = head;
        int count = 0;

        while (count < index) {
            current = current.next;
            count++;
        }

        T oldData;
        oldData = current.data;
        current.data = data;

        return oldData;
    }

    public void incorrectIndex(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index is invalid");
        }
    }

    public void incorrectAddOnIndex(int index) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Index is invalid");
        }
    }

    public void checkListIsEmpty() {
        if (count == 0) {
            throw new IndexOutOfBoundsException("List is empty");
        }
    }

    public Iterator<T> iterator() {

        return new Iterator<>() {
            Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                T data = current.data;
                current = current.next;

                return data;
            }
        };
    }
}
