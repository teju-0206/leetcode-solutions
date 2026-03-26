// LeetCode #217 - Contains Duplicate
// Difficulty: Easy | Date: 2026-03-26
// Approach: HashSet for O(n) duplicate detection

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
    
