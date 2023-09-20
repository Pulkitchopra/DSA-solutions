class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {



        List<Integer> ans = new ArrayList<>();

        if(matrix == null || matrix.length == 0){

            return ans;
        }


        int rows = matrix.length;
        int cols = matrix[0].length;
        int startingRow = 0;

        int startingCol = 0;

        int endingRow = rows-1;

        int endingCol = cols-1;

        while(startingCol<=endingCol && startingRow<=endingRow){





            for(int index = startingCol; index<=endingCol; index++){

                ans.add(matrix[startingRow][index]);
            }
                startingRow++;

            for(int index = startingRow; index<=endingRow; index++){

                ans.add(matrix[index][endingCol]);
            }
                endingCol--;


            if(startingRow<=endingRow){








            for(int index = endingCol; index>=startingCol; index--){

                ans.add(matrix[endingRow][index]);
            }
                endingRow--;

            }

            if(startingCol<=endingCol){


            for(int index = endingRow; index>=startingRow; index--){

                ans.add(matrix[index][startingCol]);

            }
                startingCol++;
            }
        }









        return ans;
    }
}
