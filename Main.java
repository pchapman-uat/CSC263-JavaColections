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
    }
}