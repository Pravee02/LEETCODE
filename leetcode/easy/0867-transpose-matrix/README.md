# Transpose Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a 2D integer array `matrix`, return  *the  **transpose**  of*  `matrix`.

The  **transpose**  of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

 

 **Example 1:** 

```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

```

 **Example 2:** 

```
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 1000
- 1 <= m * n <= 105
- -109 <= matrix[i][j] <= 109

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 30.90%)  
**Memory:** 46 MB (beats 95.89%)  
**Submitted:** 2026-11-05T02:26:36.015Z  

```java
class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] newArray = new int[matrix[0].length][];
        for(int row = 0; row < matrix[0].length; row++)
        {
            newArray[row] = new int[matrix.length];

        }

        for(int row = 0 ; row < matrix.length;row++)
        {
            for(int col = 0; col < matrix[row].length;col++)
            {
                newArray[col][row] = matrix[row][col];
            }
        }
        return newArray;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/transpose-matrix/)