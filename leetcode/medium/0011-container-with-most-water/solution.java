class Solution {
    public int maxArea(int[] height) {
        
        // int minh = 0; 
        // int result = 0;
        // for(int l = 0; l < height.length-1; l++)
        // {
        //     for(int r = l + 1 ; r < height.length; r++)
        //     {
        //         if(height[l] <= height[r])
        //         {
        //             minh = height[l];
        //         }
        //         else
        //         {
        //             minh = height[r];
        //         }
        //         int width = r - l;
        //         int waterdensity = minh * width;
        //         if(waterdensity > result)
        //         {
        //             result = waterdensity;
        //         }
        //     }
        // }
        // return result;
        int l = 0; 
        int r = height.length-1;
        int minh = 0;
        int result = 0;
        while(l < r)
        {
            if(height[l] <= height[r])
                {
                    minh = height[l];
                }
                else
                {
                    minh = height[r];
                }
                int width = r - l;
                int waterdensity = minh * width;
                if(waterdensity > result)
                {
                    result = waterdensity;
                }

                if(height[l] <= height[r])
                {
                    l++;
                }
                else
                {
                   r--;
                }
        }
        return result;
    }
}