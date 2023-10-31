public class Solution {



	public static int [] nextSmallerElement(int arr[], int n){

		Stack<Integer> s = new Stack<>();
		int ans [] = new int[n];




		s.push(-1);
		for(int i = n-1; i >= 0; i--){
			int curr = arr[i];

			while(s.peek() != -1 && arr[s.peek()] >= curr){

				s.pop();
			}
			ans[i] = s.peek();

			s.push(i);
		}
		return ans;
	}


	public static int [] prevSmallerElement(int arr[], int n){

		Stack<Integer> s = new Stack<>();

		int ans [] = new int[n];

		s.push(-1);

		for(int i = 0; i < n; i++){
			
			int curr = arr[i];

			while(s.peek() != -1 && arr[s.peek()] >= curr){

				s.pop();
			}


			ans[i] = s.peek();



			s.push(i);
		}
		return ans;
	}




	public static int largestRectangleArea(int heights[], int n){
		int next[] = nextSmallerElement(heights, n);

		int prev[] = prevSmallerElement(heights, n);

		int area = 0;


		for(int i = 0; i < n; i++){






			if(next[i] == -1){


				next[i] = n;
			}
			int l = heights[i];
			int b = next[i] - prev[i] - 1;

			int areaValue = l * b;
		
		
			area = Math.max(area, areaValue);
		}
		return area;
	}



	public static int maximalAreaOfSubMatrixOfAll1(int[][] mat, int n, int m) {


		int area = largestRectangleArea(mat[0], m);

		for(int i = 1; i < n; i++){







			for(int j = 0; j < m; j++){

				if(mat[i][j] != 0){





					mat[i][j] = mat[i][j] + mat[i-1][j];
				}
				else{

					mat[i][j] = 0;
				}
			}
				area = Math.max(area, largestRectangleArea(mat[i], m));
		}

		return area;

	}
}
