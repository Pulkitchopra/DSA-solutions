public class Solution {


   public static boolean isPossible( int arr[], long n, long m, long mid){

        int studentCount = 1;

        long pageSum = 0;
        for(int i =0; i<m; i++){



            if(pageSum + arr[i] <= mid){


                pageSum += arr[i];
            }
            else{

                studentCount++;

                if(studentCount > n || arr[i] > mid){
                    return false;
                }

                pageSum = arr[i];

            }


        }
        return true;

    }

    public static long ayushGivesNinjatest(int n, int m, int[] time) {

        long s = 0;
        long sum = 0;


        for(int i = 0; i<m; i++){

            sum+=time[i];   
        }



        long e = sum;
        long ans = -1;

        long mid = (s + e)/2;





        while(s<=e) {


            if(isPossible(time, n, m, mid)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }





            mid = ( s + e)/2;

        }


        return ans;
    }
}
