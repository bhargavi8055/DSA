=======Question Link=======
  https://www.naukri.com/code360/problems/nth-fibonacci-number_74156?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
========Solution=======
  import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner scan = new Scanner(System.in);

		int n= scan.nextInt();

		if(n==1 || n==2) 
			System.out.println(1);

		else{
			int first = 1,second=1;
			int third=first+second;

			for(int i=4;i<=n;i++){
				first=second;
				second=third;
				third=first+second;
			}
			
			System.out.println(third);
		}
	
	}

}
