package Collections;

public class HashTable<K, V> {
    private final int SIZE;
    private Node<K,V>[] table;
    
    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        this.SIZE = size;
        table = new Node[SIZE];
    }
    private int hash(K key){
        return Math.abs(key.hashCode()) % SIZE;
    }
    public void put(K key, V value) {
        int hash = hash(key);
        Node<K, V> newNode = new Node<K,V>(key, value);
        if(table[hash] == null) {
            table[hash] = newNode;
        } else {
            Node<K, V> current = table[hash];
            Node<K, V> previous = null;
            while(current != null) {
                if(current.key.equals(key)) {
                    current.value = value;
                    return;
                } previous = current;
                current = current.next;
            }
            previous.next = newNode;
        }
    }
    public V get(K key) {
        int hash = hash(key);
        Node<K, V> current = table[hash];
        while(current!= null) {
            if(current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
    public void remove(K key){
        int hashCode = hash(key);
        Node<K, V> current = table[hashCode];
        Node<K, V> previous = null;
        while(current!= null) {
            if(current.key.equals(key)) {
                if(previous == null){
                    table[hashCode] = current.next;
                } else {
                    previous.next = current.next;
                }
            }
            previous = current;
            current = current.next;
        }
    }
}

class Node<K, V> {
    public K key;
    public V value;
    public Node<K, V> next;
    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}