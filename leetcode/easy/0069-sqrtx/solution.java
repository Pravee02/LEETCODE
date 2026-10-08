class Solution {
    public int mySqrt(int x) {
        
        if(x == 1)
        {
            return 1;
        }
        for(double i = 0 ; i <= x / 2; i++)
        {
            if( i * i == x)
            {
                return (int)i;
            }
            else if(  ((i+1) * (i+1)) > x)
            {
            return (int)i;
            }
        }
        return -1;
    }
}