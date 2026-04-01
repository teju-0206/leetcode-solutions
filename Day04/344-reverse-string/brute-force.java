// LeetCode #344 - Reverse String
// Difficulty: Easy | Date: 2026-03-30
// Approach: Brute Force
// - Create a new array and fill elements in reverse order
// - Copy the reversed array back into original array
// Time: O(n) | Space: O(n)

class Solution {
    public void reverseString(char[] s) {
        char[] result = new char[s.length];

        for (int i = 0; i < s.length; i++) {
            result[i] = s[s.length - 1 - i];
        }

        for (int i = 0; i < s.length; i++) {
            s[i] = result[i];
        }
    }
}
