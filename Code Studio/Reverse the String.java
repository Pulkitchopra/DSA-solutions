public class Solution {	


	static void reverse(char str[], int i, int j){



		if(i>j){



			return;
		}


		char temp = str[i];

		str[i] = str[j];

		str[j] = temp;

		i++;
		j--;




		reverse(str, i, j);
	}


	public static String reverseString(String str) {

		StringBuilder s = new StringBuilder(str);

		int i = 0;
		
		int j = str.length()-1;

		while(i<j){

			char temp = s.charAt(i);
			s.setCharAt(i, s.charAt(j));
			s.setCharAt(j, temp);





			i++;
			j--;
		}





		return s.toString();
	}
}
