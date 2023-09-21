public class Solution {
  
  
  public static int sumOfMaxMin(int[] arr, int n) {

    Arrays.sort(arr);  

      int min = arr[0];



      int max = arr[n-1];

      int ans = max + min;

      return ans;
  }
}
