// LeetCode #1480 - Running Sum of 1D Array
// Difficulty: Easy | Date: 2026-03-27
// Approach: In-place Prefix Sum (Optimal)
// - Update each element using previous running sum
// - nums[i] = nums[i] + nums[i-1]
// Time: O(n) | Space: O(1)

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
