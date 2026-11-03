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