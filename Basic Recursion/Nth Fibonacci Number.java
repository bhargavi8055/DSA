======Question Link======
https://leetcode.com/problems/fibonacci-number/
====Solution=====
class Solution {
    public int fib(int n) {
        if (n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
    
}
