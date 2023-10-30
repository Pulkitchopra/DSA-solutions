public class Solution {


	public static void solve(Stack<Integer> inputStack, int count, int size){
		
		if( inputStack.empty() || count == size){
			return;
			


			
		}

		int num = inputStack.pop();
		
		solve(inputStack, count + 1, size);

		if(count != (size - 1)/2 ){
			
		inputStack.push(num);
			
		}
	}
	

	



	public static void deleteMiddle(Stack<Integer> inputStack, int N) {



		int count =  0;
		
		solve(inputStack, count, N);
				
	}
}
