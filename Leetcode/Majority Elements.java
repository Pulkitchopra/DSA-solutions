class Solution {
    public List<Integer> majorityElement(int[] nums) {



        Map<Integer, Integer> elementMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            elementMap.put(nums[i], elementMap.getOrDefault(nums[i], 0) + 1);

        }


        List<Integer> ans = new ArrayList<>();
        int threshold = nums.length / 3;


        for(Map.Entry<Integer, Integer> entry: elementMap.entrySet()){

            int element = entry.getKey();

            int count = entry.getValue();

        if(count > threshold){
            ans.add(element);

        }
        }

        return ans;
        
    }
}
