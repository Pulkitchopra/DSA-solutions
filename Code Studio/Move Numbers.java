public class Solution {

    public static int[] separateNegativeAndPositive(int a[]) {


        int s = 0;

        int e = a.length-1;

        



        while(s<=e){

            if(a[s] >= 0 && a[e] < 0){

                int temp = a[s];

                a[s] = a[e];



                a[e] = temp;
                s++;


                e--;

            }

            else if(a[s] < 0){

                s++;
            }


            else if(a[e] >= 0){

                e--;
            }
        }

        

        return a;
    }
}
