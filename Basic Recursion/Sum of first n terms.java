
  =======Formula=======
  Sum of first n natural numbers = n*(n+1)/2
  Sum of squares of n natural numbers = n*(n+1)*(2n+1)/6
  Sum of cubes of n natural numbers = (n*(n+1)/2)^2 = n^2*(n+1)^2/4


  =====Solution==========
----------Using Recursion-------
class Recursion {
    
    static int func(int n){
        
            // Base Condition.
            if(n == 0){
                
                return 0;
            }
            
            // Problem broken down into 2 parts and then combined.
            return n + func(n-1);
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 3.
       int n = 3;
       System.out.println(func(n));
    }
}
