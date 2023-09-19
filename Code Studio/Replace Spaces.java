public class Solution {
	
	
	public static StringBuilder replaceSpaces(StringBuilder str) {



		for(int i = 0; i< str.length(); i++){



			if(str.charAt(i)== ' '){
				str.replace(i, i+1, "@40");
			}

		}
		
		return str;
	}
}
