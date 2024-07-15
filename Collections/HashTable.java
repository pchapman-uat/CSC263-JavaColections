package Collections;

public class HashTable<K, V> {
    // Size of the Hash Table
    private final int SIZE;
    // Node Tree of the table
    private Node<K,V>[] table;
    
    // Constructor of the class
    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        this.SIZE = size;
        table = new Node[SIZE];
    }
    // get the hash of a key
    private int hash(K key){
        return Math.abs(key.hashCode()) % SIZE;
    }
    // Add a element to the table with a key and value
    public void put(K key, V value) {
        // Get the hash of the key
        int hash = hash(key);
        // Create a new node of the key and value
        Node<K, V> newNode = new Node<K,V>(key, value);
        // If the table hash is null, set it to the new Node
        if(table[hash] == null) {
            table[hash] = newNode;
        } else {
            // Get the current node of the table at the hash
            Node<K, V> current = table[hash];
            // Set the privious node to null
            Node<K, V> previous = null;
            // While the current is not null
            while(current != null) {
                // If the currents key equals the input key
                if(current.key.equals(key)) {
                    // set the current value to the value
                    current.value = value;
                    return;
                }
                // Else set the previous to the current 
                previous = current;
                // Set the curret to the next
                current = current.next;
            }
            // Set the preivus next to the new node
            previous.next = newNode;
        }
    }
    // Get a value from a key
    public V get(K key) {
        // Get the hash of the key
        int hash = hash(key);
        // Get the current node
        Node<K, V> current = table[hash];
        // While the current is not null
        while(current!= null) {
            // If the current key is the input key, return the value
            if(current.key.equals(key)) {
                return current.value;
            }
            // Else go to the next value
            current = current.next;
        }
        // If not found return null
        return null;
    }
    // Remove element using key
    public void remove(K key){
        // Get the hash of the key
        int hashCode = hash(key);
        // Get the current element at the hash
        Node<K, V> current = table[hashCode];
        // Initialize the previous tracker
        Node<K, V> previous = null;
        // While the current is not null
        while(current!= null) {
            // If the key equals the remove key
            if(current.key.equals(key)) {
                // If the previous is null
                if(previous == null){
                    // Set the table at the hash code to the next element
                    table[hashCode] = current.next;
                } else {
                    // set the previous next to the currents next
                    previous.next = current.next;
                }
            }
            // Set previous to current
            previous = current;
            // Set current to the next of the current
            current = current.next;
        }
    }
}

// Class for handling nodes
class Node<K, V> {
    public K key;
    public V value;
    // Next Node
    public Node<K, V> next;
    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}