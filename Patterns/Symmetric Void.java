========Question Link =========
  https://www.naukri.com/code360/problems/symmetric-void_6581919?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
==========Solution===========
  public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=(n*2)-(n-i+1)*2;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(n-i+1);j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=(n*2)-(n-i+1)*2;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
}
