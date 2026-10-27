class Solution {
    public int[] replaceElements(int[] arr) {  // 17  18  5  4  6  1
        
        int[] newArray =  arr.clone();

        int j = 0;
        while(j < arr.length-1)
        {
            int greater = arr[j+1];
            for(int i = j+1; i < arr.length; i++)
            {
               if(arr[i] > greater)
               {
                greater = arr[i];
               }
            }
            newArray[j] = greater;
            j++;
        }
        if(j == arr.length-1)
        {
            newArray[j] = -1;
        }
        return newArray;
    }
}