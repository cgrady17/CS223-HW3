import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Author: Connor P Grady
 * Born: 3/9/2015
 * Description: Write a stack class that uses an ArrayList as its internal data structure.
 */
public class Stack<E> {
    private ArrayList<E> data;

    // Default constructor
    public Stack() {
        // Create ArrayList object
        data = new ArrayList<E>();
    }

    public void push(E item) {
        data.add(item);
    }

    public E pop() {
        if (!isEmpty()) {
            return data.remove(size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }

    public E peek() {
        if (!isEmpty()) {
            return data.get(size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return (data.size() == 0);
    }

    public int size() {
        return data.size();
    }

    @Override
    public String toString() {
        return "ArrayList Stack = [" + data.toString() + "]";
    }
}
