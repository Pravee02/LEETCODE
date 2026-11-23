class Solution {
    public boolean checkString(String s) {
        
        // for(int i = 0; i < s.length()-1; i++)
        // {
        //     if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a')
        //     return false;
        // }
        // return true;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        boolean isSorted = s.equals(new String(chars));
        if(isSorted)
        {
            return  true;
        }
        return false;

    }
}