public class SortedTwoSum_1 {

    static boolean isPairExits(int[] numbers, int target){
        int left = 0;
        int right = numbers.length-1;
        boolean result = false;
        while(left<right)
        {
            int sum = numbers[left] + numbers[right];
            if(sum == target)
            {
                result = true;
                break;
            }
            else if(sum > target)
            {
                right--;
            }
            else{
                left++;
            }
           
            
        }
        return result;
        

    }
    
    public static void main(String[] args) {
        
        int[] nums = {1, 2, 4, 6, 8, 9, 11};
        int target = 20;
        boolean res = isPairExits(nums,target);
        System.out.println(res);
    }
}
