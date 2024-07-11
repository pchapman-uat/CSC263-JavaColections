package Collections;

import java.util.LinkedList;

public class Stack<T> {
    private final LinkedList<T> list = new LinkedList<T>();
    public void push(T item){
        list.addFirst(item);
    }
    public T pop(){
        return list.removeFirst();
    }
    public T peek(){
        return list.getFirst();
    }
}
