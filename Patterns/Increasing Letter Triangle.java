===========Link for the Problem Statement===========
https://www.naukri.com/code360/problems/increasing-letter-triangle_6581897?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
===========Problem statement===========
Problem statement
Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Increasing Letter Triangle.

Example:
Input: ‘N’ = 3

Output: 

A
A B
A B C
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
A
A B
A B C
Sample Input 2 :
4
Sample Output 2 :
A
A B
A B C 
A B C D
Sample Input 3 :
7
Sample Output 3 :
A
A B
A B C 
A B C D
A B C D E
A B C D E F
A B C D E F G
===========Solution===========
public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            char k='A';
            for(int j=0;j<=i;j++){
                System.out.print(k+++" ");
            }
            System.out.print("\n");
        }
    }
}
