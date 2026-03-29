// LeetCode #724 - Find Pivot Index
// Difficulty: Easy | Date: 2026-03-29
// Approach: Prefix Sum (Optimized)
// - First compute total sum of array
// - Maintain running left sum while iterating
// - Compute right sum as: total - leftSum - nums[i]
// - Check if leftSum == rightSum at each index
// Time: O(n) | Space: O(1)

class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;

        // Step 1: find total sum
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;

        // Step 2: iterate and check pivot
        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
