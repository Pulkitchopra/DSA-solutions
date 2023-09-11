class Solution {
    public List<Integer> findDuplicates(int[] nums) {



        List <Integer> list = new ArrayList();

        HashSet <Integer> set = new HashSet();

        for(int i:nums){
            if(set.contains(i)){


                list.add(i);
            }
            else{

                set.add(i);
            }

        }
        return list;
        
    }
}
