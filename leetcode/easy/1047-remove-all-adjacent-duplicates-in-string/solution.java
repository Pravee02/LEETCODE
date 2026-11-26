class Solution {
    private int top = -1;
    private char stack[];

    public void push(char ch)
        {
            top++;
            stack[top] = ch;
        }

    public char pop()
        {
            char ch = stack[top];
            top--;
            return ch;
        }

    public String removeDuplicates(String s) {
        
       stack = new char[s.length()];
        

        for(int i = s.length()-1; i >= 0; i--)
        {
            if(top == -1)
            {
                push(s.charAt(i));
                continue;
            }
            if(stack[top] == s.charAt(i))
            {
                pop();
            
            }
            else
            {
                push(s.charAt(i));
            }
        }
        StringBuffer newString= new  StringBuffer("");
        for(int i = top ; i >=0 ; i--)
        {
        char ch = pop();
        newString.append(ch);
        }

        return newString.toString();
    }

    }
