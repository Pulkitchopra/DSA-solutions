public class Solution {

    static int binarySearch(int arr[], int s, int e, int key){


        if(s>e){

            return -1;

        }



        int mid = (s + e)/2;

        if(arr[mid] == key){

            return mid;
        }
        if(arr[mid] < key){

            return binarySearch(arr, mid+1, e, key);
        }
        else{
            return binarySearch(arr, s, mid-1, key);


        } 

    }

    public static int search(int []nums, int target) {

        int ans = binarySearch(nums, 0, nums.length-1, target);
        
        return ans;
    }
}
