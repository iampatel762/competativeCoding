import java.util.PriorityQueue;

public class p06_priorityQueue_multiplicationOf3HigehstNumber {
    
    public static int findLargestDistinctProduct(int[] nums) {
        if (nums == null || nums.length < 3) {
            System.out.println("Array should contain at least three elements.");
            return -1;
        }
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        for (int num : nums) {
            maxHeap.offer(num);
        }
        
        int largest1 = maxHeap.poll();
        int largest2 = maxHeap.poll();
        int largest3 = largest2;
        while (!maxHeap.isEmpty() && largest3 == largest2) {
            largest3 = maxHeap.poll();
        }
        
        long product = (long)largest1 * largest2 * largest3;
        
        return (int)product;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 3, 6, 4};
        
        int product = findLargestDistinctProduct(nums);
        
        if (product != -1) {
            System.out.println("Product of the three largest distinct elements: " + product);
        }
    }
}
