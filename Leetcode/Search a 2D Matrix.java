class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {



        int rows = matrix.length;

        int cols = matrix[0].length;

        int s = 0;



        int e = rows*cols-1;
        int mid = (s+e)/2;


        while(s<=e){



            int element = matrix[mid/cols][mid%cols];

            if(element == target){
                return true;
            }



            else if(element < target){

                s = mid + 1;
            }


            else{

                e = mid - 1;    

            }

            mid = (s+e)/2;

        }

        return false;
    }
}
