public class Solution {


    public static boolean isSafe(int x, int y, int n, int visited [][], int arr [][]){

        if(( x>=0 && x<n ) && (y>=0 && y<n) && (visited[x][y] == 0 && arr[x][y] == 1)){

            return true;
        }


        else{
            return false;
        }

    }

    public static void solve(int arr[][], int n, ArrayList<String> ans, int x, int y, int visited[][], StringBuilder path){

        if(x == n-1 && y == n-1){

            ans.add(path.toString());
            return;
        }

        visited[x][y] = 1;



        int newx = x + 1;
        int newy = y;
       if(isSafe(newx, newy, n, visited, arr)){

           path.append('D');

           solve(arr, n, ans, newx, newy, visited, path);
           path.deleteCharAt(path.length()-1);
       }
        newx = x;
        newy = y-1;

       if(isSafe(newx, newy, n, visited, arr)){
           path.append('L');
           solve(arr, n, ans, newx, newy, visited, path);
           path.deleteCharAt(path.length()-1);
       }


        newx = x;
        newy = y+1;

       if(isSafe(newx, newy, n, visited, arr)){

           path.append('R');
           solve(arr, n, ans, newx, newy, visited, path);
           path.deleteCharAt(path.length()-1);
       }

        newx = x - 1;       
        newy = y;
       if(isSafe(newx, newy, n, visited, arr)){

           path.append('U');
           solve(arr, n, ans, newx, newy, visited, path);
           path.deleteCharAt(path.length()-1);
       }
       visited[x][y] = 0;
    }




    public static ArrayList < String > findSum(int[][] arr, int n) {


        ArrayList < String > ans = new ArrayList<>();

        if(arr[0][0] == 0){
            return ans;        
        }

        int visited [][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                visited[i][j] = 0;                
            }
        }
        StringBuilder path = new StringBuilder("");
        solve(arr, n, ans, 0, 0, visited, path);

        return ans;
    }
}
