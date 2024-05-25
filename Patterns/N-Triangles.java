::::::::::::Link for the Problem Statement::::::::::::
  https://www.naukri.com/code360/problems/n-triangles_6573689?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
::::::::::::Problem statement::::::::::::
Sam is making a Triangular painting for a maths project.

An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.

For every value of ‘N’, help sam to print the corresponding N-dimensional Triangle.

Example:
Input: ‘N’ = 3

Output: 
1
1 2 
1 2 3
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 25
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
1
1 2 
1 2 3
Sample Input 2 :
1
Sample Output 2 :
1


::::::::::::Solution::::::::::::

  public class Solution {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print((j+1)+" ");
            }
            System.out.print("\n");
        }
      // another approach (starting loop variable value from 1) and there are many approaches
      // for(int i=1;i<=n;i++){
      //       for(int j=1;j<=i;j++){
      //           System.out.print((j+1)+" ");
      //       }
      //       System.out.print("\n");
      //   }
    }
}
