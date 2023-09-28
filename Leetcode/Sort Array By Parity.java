class Solution {
    public int[] sortArrayByParity(int[] nums) {

        
        
        int s = 0;

        int e = nums.length;

        int mid = 0;


       
        while(mid<e){
        
            if(nums[mid] % 2 == 0){
        
                int temp = nums[s];

                nums[s] = nums[mid];

                nums[mid] = temp

                s++;
            }






                mid++;       
        }

        
        return nums;
    }
}
