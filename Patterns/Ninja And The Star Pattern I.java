=======Question Link ======
  https://www.naukri.com/code360/problems/ninja-and-the-star-pattern-i_6581920?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
========Solution==========
  public class Solution {
    public static void getStarPattern(int n) {
        // Write your code here
        if(n==1){
            System.out.print("*");
        }
        else{
            for(int i=1;i<=n;i++){
                System.out.print("*");
            }
            System.out.println();
            for(int i=1;i<=n-2;i++){
                System.out.print("*");
                for(int j=1;j<=(n-2);j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            for(int i=1;i<=n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
