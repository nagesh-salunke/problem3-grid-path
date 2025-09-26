# Grid Path with One Wall Break

Given an N x M grid of 0s and 1s:
- 0 = free cell, 1 = wall.
- Start at (0,0) and reach (N-1, M-1).
- You may break at most 1 wall.

Find the shortest path length. Print -1 if not possible.

## Input
N M
row1
row2
...
rowN

## Constraints
1 ≤ N, M ≤ 1000

## Output
Shortest path length or -1

## Examples
Input:
3 3
010
010
000
Output:
5

Input:
2 2
11
11
Output:
-1

