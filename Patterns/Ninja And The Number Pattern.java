=====Question Link =======
  https://www.naukri.com/code360/problems/ninja-and-the-number-pattern-i_6581959?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
=====Solution====
  public class Solution {
    public static void getNumberPattern(int n) {
        // Write your code here.
        
        for(int i=0;i<n*2-1;i++){
            for(int j=0;j<n*2-1;j++){               
                int top=i,left=j, right=2*n-2-j,bottom=2*n-2-i;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)));

            }
            System.out.println();
        }
    }
}
