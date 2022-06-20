import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SimpleLinked<E> implements Linked<E>,Iterable<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

// null <- prevElement[firstNode(e=null)]nextElement-><- prevElement[firstNode(e=val)]nextElement-> <- prevElement[firstNode(e=null)]nextElement -> null

    public SimpleLinked() {
        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lastNode);
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node<E>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = firstNode;
        next.setCurrentElement(e);
        firstNode = new Node<>(null, null, next);
        next.setNextElement(lastNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = firstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElement();
    }
    public Iterator<E> iterator(){
        return new Iterator<E>() {
            int counter= 0;
            @Override
            public E next() {
                return getElementByIndex(counter++);
            }
            public boolean hasNext() {
                return counter<size;
            }
        };
    }
    @Override
    public Iterator descendingIterator() {
        return null;
    }
    int counter;
    @Override
    public boolean hasNext() {
        return counter<size;
    }

    @Override
    public E next() {
        return getElementByIndex(counter--);
    }


    public static class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private final Node<E> prevElement;

        public Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public E getCurrentElement() {
            return currentElement();
        }

        private E currentElement() {
            return currentElement;
        }
        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }
        public Node<E> getNextElement() {
            return nextElement;
        }
        public Node<E> prevNextElement() {
            return prevElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.nextElement = prevElement;
        }
    }
}
