class Solution {
    public int addDigits(int num) {
        int sum = 0;  // 11
        while(num > 0)
        {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        if(sum >= 0 && sum <= 9)
        {
            return sum;
        }
        else
        {
            return addDigits(sum);
        }
        
    }

    
}