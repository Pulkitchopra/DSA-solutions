public class Solution {

    public static int minimumJumps(int[] arr, int N) {
        if(N <= 1){
            return 0;
        }
        if(arr[0] == 0){
            return -1;
        }

        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;
        int i = 1;
        for (i = 1; i < N; i++){

            if(i == N-1){
                return jump;
            }

            maxReach = Math.max(maxReach, i + arr[i]);
            step--;
            if(step == 0){
                jump++;
                if(i >= maxReach){
                    return -1;
                }
                step = maxReach - i;
            }
        }
        return -1;
    }

}
