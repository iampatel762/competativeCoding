import java.util.*;

public class TwoSumDemo {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Create a hashmap to store value and index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement

            if (map.containsKey(complement)) {
                // Found a pair that adds up to the target
                return new int[]{map.get(complement), i};
            }

            // Add the current number and its index to the hashmap
            map.put(nums[i], i);
        }

        // No valid pair found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // Example input array
        int target = 9; // Example target value

        int[] result = twoSum(nums, target);

        if (result[0] != -1) {
            System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
            System.out.println("Numbers at those indices: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No valid pair found.");
        }
    }
}
