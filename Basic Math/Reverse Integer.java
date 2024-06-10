=========Quesion Link ======
  https://leetcode.com/problems/reverse-integer/
=========Solution======
  class Solution {
    public int reverse(int x) {
        int k=x;
        boolean isNeg=false;
        if(k<0){
            isNeg=true;
            k=-k;
        }
        long res=0;
        while(k>0){
            res*=10;
            res+=k%10;
            k/=10;
        }
        if(res>Integer.MAX_VALUE) return 0;
        if(isNeg) return -(int)res;
        return (int)res;
    }
}
