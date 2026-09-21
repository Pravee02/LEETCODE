public class SortedTwoSum_3 {
    static int removeDuplicates(int[] numbers)
    {
        int right = 0;
        int left = 1;
       
       int count = 0;
   

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
                                               

        return count + 1;
    }
    public static void main(String[] args) {
        
        int num[] = {1, 1, 2, 3, 3, 3, 4};
        int result = removeDuplicates(num);
        System.out.println(result);
      
        
    }
    
}
