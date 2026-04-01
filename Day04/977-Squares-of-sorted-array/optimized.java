// LeetCode #977 - Squares of a Sorted Array
// Difficulty: Easy | Date: 2026-03-30
// Approach: Two Pointers
// - Compare squares of leftmost and rightmost elements
// - Place larger square at the end of result array
// - Move pointers inward and fill from right to left
// Time: O(n) | Space: O(n)

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[pos] = leftSq;
                left++;
            } else {
                result[pos] = rightSq;
                right--;
            }

            pos--;
        }

        return result;
    }
}
