public class Solution {

    public static int minimizeIt(int[] A, int K) {

        Arrays.sort(A);
        int n = A.length;




        int ans = A[n - 1] - A[0];

        int min = A[0] + K;

        int max = A[n-1] -K;

        int minimum = 0; 

        int maximum = 0;

        for(int i = 0; i < n - 1; i++){





            minimum = Math.min(A[i+1] - K, min);

            maximum = Math.max(A[i] + K, max);

            if(minimum >= 0){

                ans = Math.min(ans, maximum - minimum);
            }
        }

        return ans; 
    }
}
