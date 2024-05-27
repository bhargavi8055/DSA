=========Link for the Problem Statement=========
  https://www.naukri.com/code360/problems/number-crown_6581894?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
  ========= Problem Statement=========
  Problem statement
Aryan and his friends are very fond of the pattern. They want to make the Reverse N-Number Crown for a given integer' N'.

Given 'N', print the corresponding pattern.

Example:
Input: ‘N’ = 3

Output: 

1         1
1 2     2 1
1 2 3 3 2 1
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
1         1
1 2     2 1
1 2 3 3 2 1
Sample Input 2 :
4
Sample Output 2 :
1             1
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1
Sample Input 3 :
7
Sample Output 3 :
1                         1
1 2                     2 1
1 2 3                 3 2 1
1 2 3 4             4 3 2 1
1 2 3 4 5         5 4 3 2 1
1 2 3 4 5 6     6 5 4 3 2 1
1 2 3 4 5 6 7 7 6 5 4 3 2 1  
  =========Solution=========
  public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=1;k<=(n*2-2*i)*2;k++){
                System.out.print(" ");
            }
            for(int m=i;m>=1;m--){
                System.out.print(m+" ");
            }        
            System.out.print("\n");
        }
    }
}
