public class Solution {
    public static long getTrappedWater(long []arr, int n) {
        int left = 0;
        int right = n - 1;
        long res = 0;
        long leftMax = arr[0];
        long rightMax = arr[n - 1];

        while(left <= right){
            if(arr[left] <= arr[right]){
                if(arr[left] > leftMax){
                    leftMax = arr[left];
                }
                else{
                    res += (leftMax - arr[left]);
                }
                left++;
            }
            else{
                if(arr[right] > rightMax){
                    rightMax = arr[right];
                }
                else{
                    res += (rightMax - arr[right]);
                }
                right--;
            }

        }
        return res;
    }
}
