public class Solution {

	public static void insertionSort(int n , int[] arr) {

		for(int i = 1; i<n; i++){

			int temp = arr[i];


			
			int j = i - 1;

			while(j>=0){

				if(arr[j] > temp){

					arr[j+1] = arr[j];
					j--;
				}
				else{
					break;
				}

			}
			arr[j+1] = temp;

			
		}


	}
}
