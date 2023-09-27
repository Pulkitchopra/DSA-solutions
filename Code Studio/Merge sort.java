public class Solution {




	static void merge(int arr[], int s, int e){

		int mid = (s+e)/2;

		int len1 = mid - s + 1;



		int len2 = e - mid;

		int firstArray [] = new int[len1];

		int secondArray [] = new int[len2];

		int mainArrayIndex = s;

		for(int i = 0; i < len1; i++){

			firstArray[i] = arr[mainArrayIndex++];

		}





		mainArrayIndex = mid + 1;
		
		for(int i = 0; i < len2; i++){

			secondArray[i] = arr[mainArrayIndex++];
		}


		int index1 = 0;

		int index2 = 0;

		mainArrayIndex = s;

		while(index1 < len1 && index2 < len2){





			if(firstArray[index1] < secondArray[index2]){

				arr[mainArrayIndex++] = firstArray[index1++];
			}
			else{

				arr[mainArrayIndex++] = secondArray[index2++];
			}
		}


		while(index1 < len1){
			arr[mainArrayIndex++] = firstArray[index1++];
		}
		while(index2 < len2){

			arr[mainArrayIndex++] = secondArray[index2++];
		}
	}




	static void solve(int arr [], int s, int e){

		
		if(s>=e){

			return;
		}

		int mid = (s+e)/2;


		solve(arr, s, mid);

		solve(arr, mid+1, e);

		merge(arr, s, e);

	}
	public static void mergeSort(int[] arr, int n) {


		solve(arr, 0, n-1);
	}
}
