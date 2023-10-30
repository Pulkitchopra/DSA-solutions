public class Solution {


	public static void solve(Stack<Integer> s, int element){

		if(s.empty()){
			s.push(element);




			return;
		}


		int num = s.peek();

		s.pop();

		solve(s, element);

		s.push(num);
	}






	public static void reverseStack(Stack<Integer> stack) {



		if(stack.empty()){

			return;
		}

		int num = stack.peek();
		stack.pop();

		reverseStack(stack);

		solve(stack, num);		
	}
}
