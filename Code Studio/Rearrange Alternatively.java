public class Solution {

    public static void swap(int[] arr, int i, int j){
        
        int temp = arr[i];
        arr[i] = arr[j];
        
        
        
        
        arr[j] = temp;          
    }
    
    
    public static void rearrange(int[] arr) {
        
        int n = arr.length;
        
        int i = -1;

        for(int j = 0; j < n; j++){    
            if(arr[j] < 0){
                
                
                
                
                i++;

                swap(arr, i, j);
             }
        }

        int pos = i + 1;

        int neg = 0;

        while(pos < n && neg < pos && arr[neg] < 0){
            
            swap(arr, pos, neg);    
            
            pos++;

            neg+=2;
        }            
    }
}
