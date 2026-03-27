// LeetCode #1480 - Running Sum of 1D Array
// Difficulty: Easy | Date: 2026-03-27
// Approach:Prefix Sum (using extra array)
// result[i] = result[i-1] + nums[i]
// Reuses previously computed sum instead of recomputing
// Time: O(n) | Space: O(n)

class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }
}
