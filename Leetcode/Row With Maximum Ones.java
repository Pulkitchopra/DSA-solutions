class Solution {

     public static int lowerBound(int arr []){

        int low = 0;
        // int ans = n;
        int high = arr.length - 1;

        while(low <= high){

            int mid = (low + high)/2;

            if(arr[mid] >= 1){
                // ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
     public int[] rowAndMaximumOnes(int[][] mat) {
         
         int res [] = {-1, -1};
        //  int maxCount = 0;
        //  int index = -1;


         for(int i = 0; i < mat.length; i++){
             Arrays.sort(mat[i]);
             
             int onesCount = mat[i].length - lowerBound(mat[i]);

             if(onesCount > res[1]){
                 res[0] = i;
                 res[1] = onesCount;
            }
        }
         return res;
        
    }
}
