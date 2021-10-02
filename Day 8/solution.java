// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(arr[0],1);
        int max = 0;
        for (int i =1; i < n; i++)
        {
            arr[i] += arr[i-1];
            if(map.containsKey(arr[i]))
            {
                max = Math.max(max,i+1 -map.get(arr[i]));
                
            }else{
                map.put(arr[i],i+1);
            }
        }
        return max;
    }
}
