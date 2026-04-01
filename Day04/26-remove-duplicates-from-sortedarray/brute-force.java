// LeetCode #26 - Remove Duplicates from Sorted Array
// Difficulty: Easy | Date: 2026-03-30
// Approach: Brute Force
// - Use an extra array to store unique elements
// - Copy unique values back to original array
// Time: O(n) | Space: O(n)

class Solution {
    public int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                temp[j] = nums[i];
                j++;
            }
        }

        // copy back
        for (int i = 0; i < j; i++) {
            nums[i] = temp[i];
        }

        return j;
    }
}
