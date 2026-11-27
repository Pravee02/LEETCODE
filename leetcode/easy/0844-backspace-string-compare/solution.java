class Solution {
    private int top = -1;
    private char stacks[];
    private char stackt[];
    public boolean backspaceCompare(String s, String t) {
        stacks = new char[s.length()];
        stackt = new char[t.length()];
        int tops = -1;
        int topt = -1;

        int sl = s.length();
        int tl = t.length();
        int n = 0;

        if(sl > tl){
            n = sl;
        }
        else{
            n = tl;
        }
        for(int i = 0; i < n ; i++)
        {
            // first string
            if(i < sl )
            {
                if(tops != -1)
                {
                    if(s.charAt(i) == '#')
                    {
                        tops--;
                    }
                }
            }
            if(i < sl && s.charAt(i)!= '#')
            {
                tops++;
                stacks[tops] = s.charAt(i);
            }

            // second string
            if(i < tl)
            {
                if(topt != -1)
                {
                    if(t.charAt(i) == '#')
                    {
                        topt--;
                    }
                }
            }
            if(i < tl && t.charAt(i) != '#')
            {
                topt++;
                stackt[topt] = t.charAt(i);
            }

        }

        StringBuilder s1 = new StringBuilder("");
        StringBuilder t1 = new StringBuilder("");

    // first string
        for(int i = tops; i >= 0; i--)
        {
            s1.append(stacks[i]);
            
        }

    // second string
        for(int i = topt; i >= 0; i--)
        {
            t1.append(stackt[i]);
            
        }
        String firstString = s1.toString();
        String secondString = t1.toString();

        return firstString.equals(secondString);

        
        

    }
}