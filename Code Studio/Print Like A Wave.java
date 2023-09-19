public class Solution {

	public static int[] wavePrint(int arr[][], int nRows, int mCols) {

		int ans[] = new int[nRows*mCols];
		
		int count = 0;



		for(int col = 0; col<mCols; col++){

			if(col%2 == 0){

				for(int row = 0; row<nRows; row++){

					ans[count++] = arr[row][col];
				}
			}

			else{





				for(int row = nRows-1; row>=0; row--){
					ans[count++] = arr[row][col];
				}

			}
		}

		return ans;
	}
}
