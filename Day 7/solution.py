#{ 
#Driver Code Starts
#Initial Template for Python 3

 # } Driver Code Ends
#User function Template for python3

class Solution:
    def checktree(self, preorder, inorder, postorder, N): 
        # Your code goes here
    	if N == 0: 
    		return 1
    		
    	if N == 1: 
    		return (preorder[0] == inorder[0]) and (inorder[0] == postorder[0]); 
    
    	idx = -1; 
    	
    	for i in range(N): 
    		if inorder[i] == preorder[0]: 
    			idx = i 
    			break
    	
    	if idx == -1: 
    		return 0;
    	
    	# matching element in postorder array
    	if preorder[0] != postorder[N-1]:
    	    return 0;
    	
    	# check for the left subtree 
    	ret1 = self.checktree(preorder[1:], inorder, postorder, idx); 
    	
    	# check for the right subtree	 
    	ret2 = self.checktree(preorder[idx + 1:], inorder[idx + 1:], 
    						postorder[idx:], N-idx-1); 
    	
    	# return 1 only if both of them are correct else 0 
    	return (ret1 and ret2)

#{ 
#Driver Code Starts.

# Driver Code 
if __name__ == "__main__": 
	t = int(input())
	for _ in range(t):
		n = int(input())
		preorder = list(map(int, input().strip().split()))
		inorder = list(map(int, input().strip().split()))
		postorder = list(map(int, input().strip().split()))
		obj = Solution()
		if(obj.checktree(preorder, inorder, postorder, n)):
			print("Yes") 
		else: 
			print("No") 


#} Driver Code Ends
