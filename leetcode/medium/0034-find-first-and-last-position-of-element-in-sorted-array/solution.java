class Solution {
    public int[] searchRange(int[] nums, int target) 
//     {

//     int left = 0;
//     int right = nums.length -1;

//     int firstaccur = 0;
//     int lastaccur =0;

//     while(left <= right)
//     {
//         int mid = left + (right - left) / 2;
        
//         if(nums[mid] == target)
//         {
//             firstaccur = mid;
//             lastaccur = mid;

//             int temp = mid-1;
//             while(temp >= 0  && nums[temp] == target)
//             {
//                 firstaccur = temp;
//                 temp--;
//             }

//             temp = mid + 1;

//             while(temp < nums.length && nums[temp] == target)
//             {
//                 lastaccur = temp;
//                 temp++;
//             }

//              return new int[]{firstaccur, lastaccur};
//         }
//             else if(nums[mid] < target)
//             {
//                 left = mid + 1;
//             }
//             else
//             {
//                 right = mid-1;
//             }
//         }  
//     return new int[]{-1, -1};
//     }
// }




{
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    static int findFirst(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int first = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                first = mid;

                // Target found, but maybe another target is on the left
                right = mid - 1;

            }
            else if (nums[mid] < target) {

                left = mid + 1;

            }
            else {

                right = mid - 1;
            }
        }

        return first;
    }

    static int findLast(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int last = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                last = mid;

                // Target found, but maybe another target is on the right
                left = mid + 1;

            }
            else if (nums[mid] < target) {

                left = mid + 1;

            }
            else {

                right = mid - 1;
            }
        }

        return last;
    }
}