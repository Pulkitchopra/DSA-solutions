public class Solution {
	
	public static void inplaceRotate(int[][] arr, int n) {


		for(int i = 0; i < n/2; i++){

			for(int j = i; j < n-i-1; j++){




				int temp = arr[i][j];
				arr[i][j] = arr[j][n-1-i];

				arr[j][n-1-i] = arr[n-1-i][n-1-j];

				arr[n-1-i][n-1-j] = arr[n-1-j][i];

				arr[n-1-j][i] = temp; 
			}

		}


		

	}
}
