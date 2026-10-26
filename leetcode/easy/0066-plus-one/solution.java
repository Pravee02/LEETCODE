class Solution {
    public int[] plusOne(int[] digits) {
        double num = 0;
        for(int i = 0; i < digits.length; i++)
        {
            num = num * 10 + digits[i];
        }

        double original = num + 1;
        double num2 = original;

        int count = 0;
        while(num2 > 0)
        {
            num2 = num2 / 10;
            count++;
        }
        int[] result = new int[count];
        int i = result.length-1;
        
            while(i >= 0 && original > 0)
            {
                
                double digit = original % 10;
                result[i] = (int)digit;
                original = original / 10;
                i--;
            }
    return result;

    }
}