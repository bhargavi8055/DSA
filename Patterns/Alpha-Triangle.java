========Question Link =========
  https://www.naukri.com/code360/problems/alpha-triangle_6581429?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
======Solution======
  public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
        
        
        for(int i=1;i<=n;i++){
            char c = (char)(65 + (n -1) );
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c-=1;
            }
            System.out.println();
        }
    }
}
