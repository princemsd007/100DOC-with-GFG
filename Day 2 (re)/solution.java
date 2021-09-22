class Solution{
    int addition(int start, int end, int arr[]){
        int result =0;
        for (int i=start;i<=end;i++){
            result+=arr[i];
        }
        return result;
        
    }
    
    List <Integer> querySum(int n,int arr[], int q, int queries[]) 
    {
        List <Integer> result = new ArrayList<>();
        for (int i=0; i<2*q; i+=2) {
            int start = queries[i]-1;
            int end= queries[i+1]-1;
            result.add(addition(start ,end, arr));
            
        }
        return result;
    }
