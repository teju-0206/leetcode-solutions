// LeetCode #557 - Reverse Words in a String III
// Difficulty: Easy | Date: 2026-03-31
// Approach: Two Pointers (In-place on char array)
// - Convert string to char array for modification
// - Traverse and detect word boundaries (space or end)
// - Reverse each word using two-pointer technique
// Time: O(n) | Space: O(n)

class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;

        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length || arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }

        return new String(arr);
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
