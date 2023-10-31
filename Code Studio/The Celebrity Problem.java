public class Solution {
	public static int findCelebrity(int n) {

		Stack<Integer> s = new Stack<>();

		for(int i = 0; i < n; i++){

			s.push(i);
		}
		while(s.size() > 1){

			int m =s.pop();





			int j = s.pop();

			if(Runner.knows(m, j)){
				
				s.push(j);
			}
			else{

				s.push(m);
			}
		}
		
		int ans = s.pop();

		

		
		
		
		
		
		
		for(int i = 0; i < n; i++){

			if( i == ans){
				continue;
			}

			if(Runner.knows(ans, i)){

				return -1;
			}
		}
		for(int i = 0; i < n; i++){

			if( i == ans){
				continue;
			}







			if(!Runner.knows(i, ans)){


				return -1;
			}
		}


		return ans;
    }
}
