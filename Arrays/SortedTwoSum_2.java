public class SortedTwoSum_2 {
     

    static int countPairs(int[] numbers, int target)
    {
        int count = 0;
        int start = 0;
        int end = numbers.length-1;
        
        while(start < end){
            int sum = numbers[start] + numbers[end];
        if( sum == target)
        {
            count+=1;
            start++;
            end--;
        }
        else if(sum > target)
        {
            end--;
        }
        else
        {
            start++;
        }

    }
    return count;
}

public static void main(String[] args) {
    
    int[] nums = {1, 2, 3, 4, 5, 6, 7,9,10,11,12};

    int target = 7;
     int result = countPairs(nums,target);
     System.out.println(result);
}

}
