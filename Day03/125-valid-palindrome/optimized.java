// LeetCode #125 - Valid Palindrome
// Difficulty: Easy | Date: 2026-03-29
// Approach: Two Pointers (Optimized)
// - Use left and right pointers to compare characters
// - Skip non-alphanumeric characters
// - Compare characters in lowercase while moving inward
// Time: O(n) | Space: O(1)

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != 
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
