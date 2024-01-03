public class Solution {

    public static void addSolution(ArrayList<ArrayList<Integer>> ans, int board[][], int n){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i= 0; i < n; i++){
            for(int j = 0; j < n; j++){
                temp.add(board[i][j]);
            }
        }
        ans.add(temp);
    }

    public static boolean isSafe(int row, int col, int board[][], int n){

        int x = row;
        int y = col;

        while(y >= 0){
            if(board[x][y] == 1){
                return false;
            }
            y--;
        }

        x = row;
        y = col;

        while( x >= 0 && y >= 0){
            if(board[x][y] == 1){
                return false;
            }
            y--;
            x--;
        }

        x = row;
        y = col;

        while(x < n && y >= 0){
            if(board[x][y] == 1){
                return false;
            }
            y--;
            x++;
        }

        return true;
    }

    public static void solve(int col, ArrayList<ArrayList<Integer>> ans, int board[][], int n){

        if(col == n){
            addSolution(ans, board, n);
            return;
        }

        for(int row = 0; row < n; row++){
            if(isSafe(row, col, board, n)){
                board[row][col] = 1;
                solve(col + 1, ans, board, n);
                board[row][col] = 0;
            }
        }     
    }

    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        

        int board[][] = new int[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], 0);
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        solve(0, ans, board, n);

        return ans;

        
    }
}
