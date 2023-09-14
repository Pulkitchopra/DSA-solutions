public class Solution 
{

    public static boolean isPossible(ArrayList<Integer> boards, int k, int mid){

        int count = 1;

        int pageSum = 0;
        for(int i =0; i<boards.size(); i++){



            if(pageSum + boards.get(i) <= mid){


                pageSum += boards.get(i);
            }
            else{

                count++;

                if(count > k || boards.get(i) > mid){
                    return false;
                }

                pageSum = boards.get(i);

            }


        }
        return true;

    }

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int s = 0;
        int sum = 0;


        for(int i = 0; i<boards.size(); i++){

            sum+= boards.get(i);   
        }



        int e = sum;
        int ans = -1;

        int mid = (s + e)/2;





        while(s<=e) {


            if(isPossible(boards, k, mid)){
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
