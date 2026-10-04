class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int found = 0;
        char result = 'a';
        for(int i =0 ; i <= letters.length-1 ; i++)
        {
            if(letters[i] > target )
            {
                 found = 1;
                return letters[i];
           
            }
            if(found == 0)
            result = letters[0];
        }
        return result;
    }
}