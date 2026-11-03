# Matrix Diagonal Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a square matrix `mat`, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

 

 **Example 1:** 

```
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

```

 **Example 2:** 

```
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

```

 **Example 3:** 

```
Input: mat = [[5]]
Output: 5

```

 

 **Constraints:** 

- n == mat.length == mat[i].length
- 1 <= n <= 100
- 1 <= mat[i][j] <= 100

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 30.91%)  
**Memory:** 45.6 MB (beats 96.46%)  
**Submitted:** 2026-11-03T07:40:53.045Z  

```java
class Solution {
    public int diagonalSum(int[][] mat) {
        
        int leftcol = 0;
        int rightcol = mat[0].length-1;
        int count = 0;
        int sum = 0;
        for(int row = 0; row < mat.length; row++)
        {
            for(int col = 0 ; col <mat[row].length;col++)
            {
                if(col == leftcol)
                {
                    sum = sum + mat[row][leftcol];
                    
                }
                else if(col == rightcol)
                {
                    sum = sum + mat[row][rightcol];
                }
                
              
            }
           
            // if( leftcol < rightcol&&count == 0){
            // leftcol++;
            // rightcol--;
            // }
            // else if(leftcol==rightcol || count!=0)
            // {
            //     leftcol--;
            //     rightcol++;
            //     count++;
            // }
            leftcol++;       // CHANGED
            rightcol--;
        }
        return sum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/matrix-diagonal-sum/)