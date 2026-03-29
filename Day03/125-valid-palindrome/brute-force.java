// LeetCode #125 - Valid Palindrome
// Difficulty: Easy | Date: 2026-03-29
// Approach: Brute Force
// - Build cleaned string (remove non-alphanumeric, convert to lowercase)
// - Reverse the string and compare with original
// Time: O(n^2) | Space: O(n)

class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = "";

        // Step 1
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned += Character.toLowerCase(c);
            }
        }

        // Step 2
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}
