public class Solution {


	public static boolean checkPalindrome(String str) {

		   str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		   int s = 0;
		   int e = str.length() - 1;


		   while(s<=e){

			   if(str.charAt(s) != str.charAt(e)){



				   return false;
			   }
			   s++;
			   e--;
		   }
		   return true;
	}
}
