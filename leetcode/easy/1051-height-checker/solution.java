class Solution {
    public int heightChecker(int[] heights)
//     {
//         int count = 0;
        
//         for(int i = 0; i < heights.length-1;i++)
//         {
//             int pointer = 0;
//             //int value = 0;
//             int index = 0;
//             int value = Integer.MIN_VALUE;
//             for(int x = 0; x < heights.length-1;x++)
//             {
//                 if(heights[x] > value)
//                 {
//                     value = heights[x];
//                     index = x;
//                 }
//             }
//             for(int j = i+1 ; j < heights.length ; j++)
//             {
               
//                 if(heights[i] > heights[j])
//                 {
                     
//                     if(heights[j] < value )
//                     {
//                         value = heights[j];
//                         index = j;
//                         pointer++;

//                     }
//                 }
//                 if(j == heights.length-1 && pointer > 0)
//                 {
//                     int temp = heights[i];
//                     heights[i] = heights[index];
//                     heights[index] = temp;
//                     count++;
//                 }
               
//             }

//         }
        

//         if(count != 0)
//         {
//             return count+1;
//         }
       
        
//         return count  ;
//     }
// }


{
int count = 0;
        
        int[] original = heights.clone();
        
        for(int i = 0; i < heights.length-1; i++)
        {
            int pointer = 0;
            int index = 0;
            int value = Integer.MIN_VALUE;
            
            for(int x = 0; x < heights.length; x++)
            {
                if(heights[x] > value)
                {
                    value = heights[x];
                    index = x;
                }
            }
            
            for(int j = i+1; j < heights.length; j++)
            {
                if(heights[i] > heights[j])
                {
                    if(heights[j] < value)
                    {
                        value = heights[j];
                        index = j;
                        pointer++;
                    }
                }
                
                if(j == heights.length-1 && pointer > 0)
                {
                    int temp = heights[i];
                    heights[i] = heights[index];
                    heights[index] = temp;
                }
            }
        }

        for(int i = 0; i < heights.length; i++)
        {
            if(original[i] != heights[i])
            {
                count++;
            }
        }

        return count;
    }
}