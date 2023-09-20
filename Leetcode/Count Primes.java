class Solution {
    public int countPrimes(int n) {



        int count = 0;

        boolean arr[] = new boolean[n+1];

        Arrays.fill(arr, true);



        if(n<2) {
            return 0;
        }

        for (int i = 2; i<n; i++){



            if(arr[i]){

                count++;





                for(int j = 2*i; j<n; j=j+i){
                    arr[j] = false;;
                }
            }

        }
        return count;
    }
}
