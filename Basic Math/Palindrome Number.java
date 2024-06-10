=========Question Link =========
https://leetcode.com/problems/palindrome-number/
  ============Solution ================
  class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        
        int rev_ref=x, rev=0;
        while(rev_ref>0){
            rev*=10;
            rev+=(rev_ref%10);
            rev_ref/=10;
        }
        if(rev==x) return true;
        return false;
        
    }
}
  
