import java.util.ArrayList;
public class Solution {



    public static int Pivot(ArrayList<Integer> arr, int n){

        int s = 0;

        int e = n - 1;
        int mid = (s+e)/2;


        while(s<e){



            if(arr.get(mid) >= arr.get(0)){

                s = mid + 1;
            }
            else{

                e = mid;
            }


            mid = (s+e)/2;

        }

        return s;

    }
    
    static int binarySearch(ArrayList<Integer> arr, int s, int e, int key) {
		
		int low = s;
		
		int high = e;
		int mid = (low + high)/2;
		
		
		while(low <= high) {
			
			if(arr.get(mid) == key) {
				
				return mid;
			}


			if(arr.get(mid) < key) {
				
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
			
			mid = (low + high)/2;
			
		}
		return -1;
			
	}


    public static int search(ArrayList<Integer> arr, int n, int k) {






        int pivotElement = Pivot(arr, n);




        if(k >= arr.get(pivotElement) && k<= arr.get(n-1)){
            return (binarySearch(arr, pivotElement, n-1, k));

        }
        else{

            return (binarySearch(arr, 0, pivotElement - 1, k));   
        }
    }
}
