public class Solution {
    
    public static void bubbleSort(int[] arr, int n) {   

        for(int i = 1; i<n; i++){

            boolean swapped = false;



            for(int j =0; j< n-i; j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;

                    swapped = true;
                }
            }



            if(swapped == false){
                
                break;
            }
        }
    }

}
