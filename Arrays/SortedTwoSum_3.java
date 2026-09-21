public class SortedTwoSum_3 {
    static int removeDuplicates(int[] numbers)
    {
        int right = 0;
        int left = 1;
       
       int count = 1;

        while(right < numbers.length-1)
        {
            if(numbers[right] == numbers[left])
            {
                                                      
                right++;
                
                left++;
            }
            else {
                count += 1;
                right++;
                left++;
                                                                      
            }
        }
                                                               

        return count;
    }
    public static void main(String[] args) {
        
        int num[] = {1, 2, 3, 4, 5};
        int result = removeDuplicates(num);
        System.out.println(result);
    }
    
}
