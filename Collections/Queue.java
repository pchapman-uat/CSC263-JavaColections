package Collections;

// Import linked list class
import java.util.LinkedList;

// Queue class
public class Queue<T>{
    // Linked list variable
    private final LinkedList<T> list = new LinkedList<T>();
    // Add to the queue (End of Queue)
    public void queue(T item){
        list.addLast(item);
    }
    // Remove from queue (Begining of Queue)
    public T dequeue(){
        return list.removeFirst();
    }
    // Get from queue (Begining of Queue)
    public T peek(){
        return list.getFirst();
    }
}