public class Solution 
{
    public static int minimumSwaps(ArrayList<Integer> arr, int n, int k) 
    {
        int count = 0;
        int ans = n;
        for(int i = 0; i < n ; i++){
            if(arr.get(i) <= k){
                count++;
            }
        }
        int b = 0;
        for(int i = 0; i < n; i++){

            if(arr.get(i) > k){
                b++;
            }

            if(i >= count && arr.get(i - count) > k){
                b--;
            }
            if(i >= count - 1){
                ans = Math.min(ans, b);
            }
        }   
        return ans;
    }
}
