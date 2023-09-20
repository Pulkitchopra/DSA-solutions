class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {



        int rows = matrix.length;

        int cols = matrix[0].length;

        int rowsIndex = 0;



        int colsIndex = cols - 1;

        while(rowsIndex<rows && colsIndex >= 0){

            int element = matrix[rowsIndex][colsIndex];



            if(element == target){

                return true;
            }




            else if(element < target){

                rowsIndex++;
            }


            else{
                
                colsIndex--;
            }
        }

        return false;

    }
}
