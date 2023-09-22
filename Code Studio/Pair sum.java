public class Solution {
    
    
    public static int pairSum(int arr[], int n, int target) {

        int s = 0;

        int e = n-1;



        int count = 0;

        while(s<e){

            int sum = arr[s] + arr[e];

            if(sum < target){



                s++;
            }




            else if(sum > target){

                e--;
            }


            else{

                count++;

                s++;

                e--;   
            }

        }





        if(count==0){
            count = -1;
        }
        return count;
    }
}
