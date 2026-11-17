class Solution {
    public String reverseWords(String s) {
        
        char[] arr = s.toCharArray();
        int right = 0;
        int left = 0;
         
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ' ' || i == arr.length-1){
                if(i != arr.length-1){
                right = i - 1;
                }
                else{
                    right = i;
                }
                while(left <= right){
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                left = i + 1;
            }
        }
         return  new String(arr);
       
    }
}