==========Link for the Problem Statement==========
https://www.naukri.com/code360/problems/star-diamond_6573686?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

  ========== Problem Statement  ==========
  Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Diamond.

Example:
Input: ‘N’ = 3

Output: 

  *
 ***
*****
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
  *
 ***
*****
*****
 ***
  *    
Sample Input 2 :
1
Sample Output 2 :
*
*
  ==========Solution==========
  public class Solution {
    public static void nStarDiamond(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i-1);j++){
                    System.out.print("*");
                }
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                System.out.print("\n");
            
        }
        for(int i=n;i>=1;i--){
            
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i-1);j++){
                    System.out.print("*");
                }
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                System.out.print("\n");
            
        }
    }
}
