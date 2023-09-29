class Solution {

    public static void swap(int arr[], int i, int j){


        int temp = arr[i];

        arr[i] = arr[j];

        arr[j] = temp;
    }


    public static void solve( List<List<Integer>> ans, int nums[], int index ){

        if(index == nums.length){

            List<Integer> list = new ArrayList<>();

            for(int i: nums){

                list.add(i);
            }
            ans.add(list);
            return;
        }





        for(int j = index; j < nums.length; j++){

            swap(nums, index, j);

            solve(ans, nums, index + 1);

            swap(nums, index, j);
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList();

        solve(ans, nums, 0);

        return ans;




    }
}
