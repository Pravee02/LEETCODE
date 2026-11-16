class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = 0;
        for(int i =0 ;i < sentences.length;i++)
        {
            int count = 1;
            String sen = sentences[i];
            for(int j =0; j < sen.length();j++)
            {
                if(sen.charAt(j) == ' ')
                {
                    count++;
                }
            }
            if(count > max)
            {
                max = count;
            }
        }
        return max;
    }
}