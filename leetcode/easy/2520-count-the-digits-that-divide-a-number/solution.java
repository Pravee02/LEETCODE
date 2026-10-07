class Solution {
    public int countDigits(int num) {
        
        int count = 0;
        int original = num;
        while(num > 0)
        {
            int value = num % 10;
            if(original % value == 0)
            {
            count++;
            }
            num = num / 10; 
        }
        return count;
    }
}