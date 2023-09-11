class Solution {
    public boolean uniqueOccurrences(int[] arr) {        
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        int count = 1;
        for(int i= 1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                if(set.contains(count)){
                    return false;
                }
                set.add(count);
                count=1;
            }

        }
        if(set.contains(count)){
            return false;
        }
        return true;

        
    }
}
