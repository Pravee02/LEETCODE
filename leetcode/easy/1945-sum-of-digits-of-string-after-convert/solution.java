class Solution {
    public int getLucky(String s, int k) {
        String number = "";
        for(int i = 0; i < s.length();i++)
        {
            number = number + (s.charAt(i) - 'a' + 1);
        }
        int total = 0;
        for(int i = 0; i < number.length(); i++)
        {
            total = total + number.charAt(i) - '0';
        }
        if(k <= 1)
        {
            return total;
        }

        while(k > 1)
        {

            int sum = 0;
            int temp = total;

            while(temp > 0)
            {
                int digit = temp % 10;
                sum = sum + digit;
                temp = temp/10;
            }
            total = sum;
            k--;
        }
        
    return total;

    }
}