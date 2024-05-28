===========Link for the Problem Statement===========
https://www.naukri.com/code360/problems/alpha-hill_6581921?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
===========Problem statement===========
Problem statement
Sam is curious about Alpha-Hills, so he decided to create Alpha-Hills of different sizes.

An Alpha-hill is represented by a triangle, where alphabets are filled in palindromic order.

For every value of ‘N’, help sam to return the corresponding Alpha-Hill.

Example:
Input: ‘N’ = 3

Output: 
    A
  A B A
A B C B A
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 25
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
    A
  A B A
A B C B A
Sample Input 2 :
1
Sample Output 2 :
A

===========Solution===========
  public class Solution {
    public static void alphaHill(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1)*2;j++){
                System.out.print(" ");
            }
            char k='A';
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=(2*i)+1;j++){
                System.out.print(k+" ");
                if(j<=breakpoint) k++;
                else k--;
            }
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
