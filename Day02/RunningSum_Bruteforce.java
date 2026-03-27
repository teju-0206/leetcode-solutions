// LeetCode #1480 - Running Sum of 1D Array
// Difficulty: Easy | Date: 2026-03-27
// Approach: Brute Force (nested loops to calculate sum up to each index) - O(n^2)

class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }

            result[i] = sum;
        }

        return result;
    }
}
