class Solution {
    public void rotate(int[] nums, int k) {



        int m = nums.length;

        int temp [] =  new int [m];

        for(int i = 0; i< m; i++){



            temp[(i+k) % m] = nums[i];
        }


        for(int i = 0; i< m; i++){

            nums[i] = temp[i];
        }

    }
}
