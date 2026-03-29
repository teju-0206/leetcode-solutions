# Day 03

## Problems Solved
- Find Pivot Index (LeetCode #724)

## Approach
- Brute Force: Calculated left and right sums for each index using nested loops
- Optimized: Used total sum and running left sum to compute right sum efficiently

## Notes
- Avoid recomputing sums → reuse total sum
- Pattern: prefix sum + subtraction to derive remaining values
- Learned to reduce O(n²) → O(n)

## Status
✔️ Completed
