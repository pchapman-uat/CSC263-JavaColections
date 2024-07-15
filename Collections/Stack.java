package Collections;
// Import the LinkedList class
import java.util.LinkedList;

// Stack class
public class Stack<T> {
    private final LinkedList<T> list = new LinkedList<T>();
    // Add an item to the Stack (Begining of stack)
    public void push(T item){
        list.addFirst(item);
    }
    // Remove item from Stack (First of stack)
    public T pop(){
        return list.removeFirst();
    }
    // Get next in stack (Get first)
    public T peek(){
        return list.getFirst();
    }
}
