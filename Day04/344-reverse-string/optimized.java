// LeetCode #344 - Reverse String
// Difficulty: Easy | Date: 2026-03-30
// Approach: Two Pointers (In-place)
// - Use left and right pointers to swap elements
// - Move pointers inward until they meet
// Time: O(n) | Space: O(1)

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
