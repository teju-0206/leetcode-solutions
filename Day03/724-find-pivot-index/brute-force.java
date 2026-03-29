// LeetCode #724 - Find Pivot Index
// Difficulty: Easy | Date: 2026-03-29
// Approach: Brute Force
// - For each index i, calculate left sum (0 to i-1) and right sum (i+1 to end)
// - Compare both sums to check if it's a pivot
// - Recomputes sums for every index using nested loops
// Time: O(n^2) | Space: O(1)

class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
