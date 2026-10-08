class Solution {
    public int alternateDigitSum(int n) {
        
        
        int reverse = 0;
        while(n > 0)
        {
            int digit = n % 10; 
           
            reverse = reverse * 10 + digit;
            n = n / 10;
            
        }
        int count = 2;
        int sum = 0;
        while(reverse > 0)
        {
            int digit = reverse % 10; 
            if(count % 2 == 0)
            {
                sum = sum + digit;
            }
            else
            {
                sum = sum - digit;
            }
            reverse = reverse / 10;
            count++;
           
        }
        
    return sum;
    }
}