public class Solution {

	public static char firstNonRepeatingCharacter(String str) {


		HashMap<Character, Integer> count = new HashMap<>();
		Queue<Character> q = new LinkedList<>();




		StringBuilder ans = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++){

			char ch = str.charAt(i);

			q.add(ch);

			count.put(ch, count.getOrDefault(ch, 0) + 1);

			while(!q.isEmpty()){
				if(count.get(q.peek()) > 1){


					q.remove();

				}


				else{
					ans.append(q.peek());
					break;
				}

				if(q.isEmpty()){

					ans.append('#');
				}
			}
		}


		return ;
	}
}
