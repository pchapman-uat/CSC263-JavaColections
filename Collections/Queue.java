package Collections;

import java.util.LinkedList;

public class Queue<T>{
    private final LinkedList<T> list = new LinkedList<T>();
    public void queue(T item){
        list.addLast(item);
    }
    public T dequeue(){
        return list.removeFirst();
    }
    public T peek(){
        return list.getFirst();
    }
}