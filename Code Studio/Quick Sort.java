public class Solution {


    public static void swap (List<Integer> arr, int i, int j){

        int temp = arr.get(i);

        arr.set(i, arr.get(j));



        arr.set(j, temp);

    }

     public static int partition(List<Integer> arr, int s, int e){

        int pivot = arr.get(s);

        int count = 0;









        for(int i = s + 1; i<=e; i++){

            if(arr.get(i) <= pivot){

                count++;
            }
        }

        int pivotIndex = s + count;

        swap(arr, s, pivotIndex);

        int i = s;
        
        int j = e;

        while(i < pivotIndex && j > pivotIndex){



            while(arr.get(i) <= pivot ){

                i++;
            }
            while(arr.get(j) > pivot ){

                j--;
            }

            if(i < pivotIndex && j > pivotIndex ){

                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }





    public static void solve(List<Integer> arr, int s, int e){


        if(s>=e){

            return;
        }  

        int p = partition(arr, s, e);


        solve(arr, s, p-1);

        solve(arr, p+1, e);
    }

    public static List<Integer> quickSort(List<Integer> arr){


        solve(arr, 0, arr.size()-1);

        return arr;
    }
}
