class Solution {
    public int strStr(String haystack, String needle) {
        int count = 0;
        int j = 0;
        int index = -1;
        for(int i = 0; i < haystack.length();i++)
        {
            
            if(haystack.charAt(i) == needle.charAt(j))
            {
              
                if(count == 0)
                {
                    index =i;
                }

                count++;
                j++;

                if(count == needle.length())
                {
                    return index;
                }
            }
            else
            {
               if (count > 0) {
                i = index;
            }

            count = 0;
            j = 0;
            //index = -1;
            }
        }
        return -1;
    }
}