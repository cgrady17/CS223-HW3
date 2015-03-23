import java.util.ArrayList;

/**
 * Author: Connor P Grady
 * Born: 3/9/2015
 * Description: Write a queue class that uses an ArrayList as its internal data structure.
 */
public class Queue<E> {
    private ArrayList<E> data;

    public Queue() {
        data = new ArrayList<E>();
    }

    public E front() {
        if (!isEmpty()) {
            return data.get(0);
        } else {
            return null;
        }
    }

    public E dequeue() {
        if (!isEmpty()) {
            return data.remove(0);
        } else {
            return null;
        }
    }

    public boolean enqueue(E thisData) {
        data.add(thisData);

        return true;
    }

    public boolean isEmpty() {
        return (data.size() == 0);
    }
}