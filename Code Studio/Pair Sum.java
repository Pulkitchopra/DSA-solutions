import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        List <int[]> ans = new ArrayList<>();

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){

            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == s){
                    int m = Math.min(arr[i], arr[j]);
                    int n = Math.max(arr[i], arr[j]);
                    int [] temp = {m,n};

                    ans.add(temp);


                }
            }

        }
        return ans;

    }
}
