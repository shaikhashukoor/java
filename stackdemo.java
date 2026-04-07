class GenericStack<T> {
    private T[] stack;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public GenericStack(int capacity) {
        this.capacity = capacity;
        stack = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = value;
        System.out.println("Pushed: " + value);
    }

    public T pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return null;
        }
        return stack[top--];
    }
}

public class stackdemo{
    public static void main(String[] args) {

        System.out.println("--- Integer Stack Operations ---");

        GenericStack<Integer> intStack = new GenericStack<>(3);

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);

        System.out.println("Popped: " + intStack.pop());

        System.out.println("\n--- String Stack Operations ---");

        GenericStack<String> stringStack = new GenericStack<>(2);

        stringStack.push("KTU");
        stringStack.push("MCA");

        System.out.println("Popped: " + stringStack.pop());
        System.out.println("Popped: " + stringStack.pop());
        stringStack.pop();
    }
}
