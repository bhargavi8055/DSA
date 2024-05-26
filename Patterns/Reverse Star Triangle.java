===========Link for the Problem Statement===========
https://www.naukri.com/code360/problems/reverse-star-triangle_6573685?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
===========Problem statement===========
Problem statement
Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the Reverse N-Star Triangle.

Example:
Input: ‘N’ = 3

Output: 

*****
 ***
  *
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
*****
 ***
  *
Explanation Of Sample Input 1 :
The first row contains five stars.
The second row contains one space, followed by three stars.
The third row contains two spaces, followed by a star.
Sample Input 2 :
1
Sample Output 2 :
*
===========Solution===========
  public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        int k=(n*2)-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
             for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            k-=2;
            System.out.print("\n");
        }
    }
}
