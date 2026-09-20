import java.util.Arrays;

class SortedTwoSum { 
    
    static  int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1} ;
            }
            else if(sum>target)
            {
                right--;
            }
            else
            left++;
        }
        return new int[]{-1,-1};
    }
    public static void main (String[] args)
    {

        int nums[] = {1,3,5,6,8,9,10};
        int target = 19;

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
        
    }
    
}