import Collections.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("=== Stack ===");
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("=== Queue ===");
        Queue<Integer> queue = new Queue<Integer>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println("=== HashTable ===");
        HashTable<String, Integer> hashTable = new HashTable<String, Integer>(3);
        hashTable.put("one", 1);
        hashTable.put("two", 2);
        hashTable.put("three", 3);
        System.out.println(hashTable.get("one"));
        hashTable.remove("one");
        System.out.println(hashTable.get("one"));
        
        System.out.println("=== ArrayList ===");
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");
        System.out.println("Size: "+ arrayList.size);
        arrayList.remove(2);
        System.out.println("Size: "+ arrayList.size);
    }
}