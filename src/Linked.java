import java.util.Iterator;

public interface Linked<E>{

    void addLast (E e);
    void addFirst (E e);
    int size();
    E getElementByIndex (int counter);

    boolean hasNext();

    E next();

    Iterator descendingIterator();
}


