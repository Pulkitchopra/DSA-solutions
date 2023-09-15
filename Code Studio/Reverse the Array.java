public class Solution 
{
    
    public static void reverseArray(ArrayList<Integer> arr, int m)

    {



        int s = m + 1;

        int e = arr.size() - 1;

        while(s<=e){

            int temp = arr.get(s);

            arr.set(s, arr.get(e));

            arr.set(e, temp);



            s++;

            e--;

        } 





    }
}
