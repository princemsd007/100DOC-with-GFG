class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        
        int firstPointer = 0;
        int secondPointer = 0;
        
        int count = 0;
        
        while (firstPointer < n && secondPointer < m)
        {
            if(arr1[firstPointer]<arr2[secondPointer])
            {
                count++;
                if(count == k)
                    return arr1[firstPointer];
                firstPointer++;
                    
            }
            else
            {
                count ++;
                if (count == k)
                   return arr1[secondPointer];
                secondPointer++;
            }
        }

        while (firstPointer <n)
        {
            count++;
                if (count==k)
                 return arr1[firstPointer];
                firstPointer++;
                
        }
        
