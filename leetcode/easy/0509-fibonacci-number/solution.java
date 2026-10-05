class Solution {
    public int fib(int n) {
        
        // if(n == 0)
        // {
        //     return 0;
        // }
        // else if(n == 1 || n ==2)
        // {
        //     return 1;
        // }
        // else
        // {
            int first = 0;
            int second = 1;
            int third;
           
        //     for(int i = 0; i <= n ; i++)
        //     {
        //         int third = first + second ;
        //         first = second;
        //         second = third;
        //     }
        //     return second;
        // }

        while(n > 0)
        {
            third = first + second;
            first = second;
            second = third;
            n--;
        }
        second = first;
        return second;
    }
}