public class Solution {
    public static List<Integer> spiralPathMatrix(int[][] matrix, int n, int m) {

        List<Integer> ans = new ArrayList<>();   
        
        if(matrix == null || matrix.length == 0 ){
            return ans;
        }




        int startingRow = 0;
        int startingCol = 0;

        int endingRow = matrix.length - 1;

        int endingCol = matrix[0].length - 1;

        while(startingRow <= endingRow && startingCol <= endingCol){

            for(int i = startingCol; i <= endingCol; i++){
                ans.add(matrix[startingRow][i]);

            }
                startingRow++;

             for(int i = startingRow; i <= endingRow; i++){

                ans.add(matrix[i][endingCol]);
            }
                endingCol--;
            

            if(startingRow <= endingRow){

                for(int i = endingCol; i >= startingCol ; i--){

                ans.add(matrix[endingRow][i]);

                }
                endingRow--;
            }






            if(startingCol <= endingCol){

                for(int i = endingRow; i >= startingRow ; i--){

                ans.add(matrix[i][startingCol]);
                }
                startingCol++;
            }
        }

        return ans;
    }
}
