class Solution {
     public void moveZeroes(int[] nums) {
         int left = 0;
        int right = left + 1;
        int length1 = (nums.length) - 1;

        if (nums.length == 0 || nums.length == 1) {
            System.out.println(nums[0]);

        }

        while (left < nums.length - 1 && right < nums.length) {
            if (nums[left] == 0 && nums[right] == 0) {
                right++;
            }

            else if (nums[left] == 0 && nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right++;
                left++;

            } else if (nums[left] != 0 && nums[right] != 0) {
                right++;
                left++;
            }
            else if (nums[left] != 0 && nums[right] == 0) {
                right++;
                left++;
            }
            

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        } 
    }
}


    // int left = 0;

    //     for(int right = 0;right<nums.length;right++)
    //     {
    //         if(nums[right] != 0)
    //         {
    //             int temp = nums[right];
    //             nums[right] = nums[left];
    //             nums[left]=temp;
    //             left++; 

    //         }
    //     }


    
//      }
// }