public class P01_minStack{
    private int[] stack;
    private int[] minStack;
    private int top;
    private int capacity;

    public P01_minStack(int size) {
        capacity = size;
        stack = new int[capacity];
        minStack = new int[capacity];
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
        if (top == 0 || x < minStack[top - 1]) {
            minStack[top] = x;
        } else {
            minStack[top] = minStack[top - 1];
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        return stack[top--];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }

    public int getMin() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return minStack[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        P01_minStack minStack = new P01_minStack(5);
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);
        minStack.display();
        System.out.println("Top element: " + minStack.top());
        System.out.println("Minimum element: " + minStack.getMin());
        minStack.pop();
        minStack.display();
        System.out.println("Minimum element: " + minStack.getMin());
    }
}
