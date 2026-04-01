// LeetCode #977 - Squares of a Sorted Array
// Difficulty: Easy | Date: 2026-03-30
// Approach: Brute Force
// - Square each element and store in a new array
// - Sort the resulting array
// Time: O(n log n) | Space: O(n)

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        // Step 1: square elements
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }

        // Step 2: sort
        Arrays.sort(result);

        return result;
    }
}
