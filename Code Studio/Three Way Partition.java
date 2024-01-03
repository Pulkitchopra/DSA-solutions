public class Solution {
    public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> arr, int n, int a, int b) {
        int start = 0;
        int end = n - 1;
        int i = 0;

        while(i <= end){

            if(arr.get(i) < a){
                Collections.swap(arr, i, start);
                i++;
                start++;
            }
            else if(arr.get(i) > b){
                Collections.swap(arr, i, end);
                end--;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
