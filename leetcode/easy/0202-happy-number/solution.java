class Solution {
    public boolean isHappy(int n) {
        
        if(n == 1)
        {
            return true;
        }
        int sum = 0;
        //int num = 1;
        do{
            while(n > 0)
            {
                int digit = n % 10;
                int square = digit * digit;
                sum = sum + square;
                n = n /10;
            }
            if(sum == 1)
            {
                return true;
            }
            else
            {
                sum = n;
            }
        }
        while(sum > 0);
        return false;
    }
}