import java.util.Stack;

public class p03_NGE {
    public static void printNGE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nge[i] = -1;
        }
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                nge[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " --> " + nge[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        System.out.println("Next Greater Element for each element:");
        printNGE(arr);
    }
}
