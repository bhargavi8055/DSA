=========Link for the Problem Statement=========
  https://www.naukri.com/code360/problems/binary-number-triangle_6581890?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
  ========= Problem Statement=========
  Problem statement
Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the N-Binary Number Triangle.

You are required to print the pattern as shown in the examples below.

Example:
Input: ‘N’ = 3

Output: 

1
0 1
1 0 1
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
1
0 1
1 0 1
Sample Input 2 :
4
Sample Output 2 :
1
0 1
1 0 1
0 1 0 1
Sample Input 3 :
6
Sample Output 3 :
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 
  =========Solution=========
  public class Solution {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.print("\n");
        }
    }
}
