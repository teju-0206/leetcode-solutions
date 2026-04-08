// LeetCode #557 - Reverse Words in a String III
// Difficulty: Easy | Date: 2026-03-31
// Approach: Brute Force
// - Split the string into words using space as delimiter
// - Reverse each word using StringBuilder
// - Concatenate all reversed words with spaces
// Time: O(n^2) | Space: O(n)

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            result += reversed + " ";
        }

        return result.trim();
    }
}
