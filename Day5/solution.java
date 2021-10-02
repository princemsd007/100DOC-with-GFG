// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            String A = sc.nextLine();
            String B = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.repeatedStringMatch(A,B));
            t--;
        }
    } 
} 
        

// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
	static int repeatedStringMatch(String a, String b) 
	{ 
        int n=(b.length()+a.length()-1)/a.length();
        
        String guess =a.repeat(n);
        
        if(guess.contains(b)) return n;
        
        guess += a;
        
        return guess.contains(b) ? n+1:-1;
	} 
} 
