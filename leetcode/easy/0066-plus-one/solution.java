class Solution {
    public int[] plusOne(int[] digits) {
    //     long num = 0;
    //     for(int i = 0; i < digits.length; i++)
    //     {
    //         num = num * 10 + digits[i];
    //     }

    //     long original = num + 1;
    //     long num2 = original;

    //     int count = 0;
    //     while(num2 > 0)
    //     {
    //         num2 = num2 / 10;
    //         count++;
    //     }
    //     int[] result = new int[count];
    //     int i = result.length-1;
        
    //         while(i >= 0 && original > 0)
    //         {
                
    //             long digit = original % 10;
    //             result[i] = (int)digit;
    //             original = original / 10;
    //             i--;
    //         }
    // return result;


    for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}