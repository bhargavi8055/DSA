
=========Question Link=======
  https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type

========Solution========
  //{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
        // code here
        if(str.equals("Character"))
            return 1;
        
        else if(str.equals("Integer"))
            return Integer.BYTES;
        
        else if(str.equals("Long"))
            return Long.BYTES;
        
        else if(str.equals("Float"))
            return Float.BYTES;
            
        else if(str.equals("Double"))
            return Double.BYTES;
            
        return -1;
    }
}
