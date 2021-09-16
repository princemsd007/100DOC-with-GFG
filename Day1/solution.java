

class Solution
{
    public static void sort012(int arr[], int n)
    {
        int count[]=new int [n+1];
        
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        
        
        int index = 0;
        
        for(int i=0; i<count.length;i++)
        {
            for(int j=0;j<count[i];j++)
            {
                arr[index]= i;
                index++;
            }
        }
    }
}
