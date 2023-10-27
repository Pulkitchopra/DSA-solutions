public class Solution {
    public static boolean checkSubset(int[] arr1, int[] arr2, int n, int m) {

        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(!map.containsKey(arr1[i])){




                map.put(arr1[i], 1);
            }
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);

        }

        for(int i = 0; i < m; i++){

            if(map.containsKey(arr2[i])){

                map.put(arr2[i], map.getOrDefault(arr2[i], 0) - 1);
                
                
                
                
                
                if(map.get(arr2[i]) == 0){

                return false;
                }
            }

            else{

                return false;
            }
        }

        return true;
    }
}
