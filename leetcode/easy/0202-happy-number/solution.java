class Solution {
    public boolean isHappy(int n) {
        
        if(n == 1)
        {
            return true;
        }
        
        //int num = 1;
        do{
            int sum = 0;
            while(n > 0)
            {
                int digit = n % 10;
                int square = digit * digit;
                sum = sum + square;
                n = n / 10;
            }
            if(sum == 1 || sum == 7)
            {
                return true;
            }
            else
            {
                n = sum;
            }
        }
        while(n > 8);
        return false;
    }
}