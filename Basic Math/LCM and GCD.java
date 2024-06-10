==========question Link ========
https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
==============Explanation ============
Consider a = 98 and b = 56

a = 98, b = 56:

a > b so put a = a-b and b remains same. So  a = 98-56 = 42  & b= 56. 
a = 42, b = 56:

Since b > a, we check if b%a=0. Since answer is no, we proceed further. 
Now b>a. So b = b-a and a remains same. So b = 56-42 = 14 & a= 42. 
a = 42, b = 14:

Since a>b, we check if a%b=0. Now the answer is yes. 
So we print smaller among a and b as H.C.F . i.e. 42 is  3 times of 14.
So HCF/GCD is 14

===============Solution ============
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long GCD = gcd(A,B);
        Long LCM = A*B / GCD;
        
        return new Long[]{LCM,GCD};
    }
    //other way
    // static Long gcd(Long a,Long b){
    //     if (b==0) return a;
    //     return gcd(b,a%b);
    // }
    static Long gcd(Long a, Long b){
        /* The below two statements are based on constraints if the numbers are start from 0 we will keep otherwise no need of writing these two lines.
        if(a==0) return b;
        if(b==0) return a;
        */
        if(a==b) return a;
        if(a>b){
            if(a%b==0) return b;
            return gcd(a-b,b);
        }
        if(b%a==0) return a;
        return gcd(a,b-a);
    }
    
};
