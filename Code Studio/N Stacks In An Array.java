public class NStack {
    // Initialize your data structure.

    int arr[];

    int next[];
    int top[];
    int n;



    int s;
    int emptyVariable;


    public NStack(int N, int S) {

        s = S;

        n = N;

        arr = new int[s];
        top = new int[n];


        next = new int[s];

        for(int i = 0; i < n; i++){

            top[i] = -1;
        }
        for(int i = 0; i < s; i++){

            next[i] = i + 1;
        }
        next [s-1] = -1;

        emptyVariable = 0;
    }

    
    public boolean push(int x, int m) {

        if(emptyVariable == -1){

            return false;
        }


        int index = emptyVariable;

        emptyVariable =  next[index];

        arr[index] = x;

        next[index] = top[m-1];

        top[m-1] = index;
        return true;

    }

    public int pop(int m) {
        if(top[m-1] == -1){

            return -1;
        }





        int index = top[m-1];


        top[m-1] = next[index];

        next[index] = emptyVariable;

        emptyVariable = index;

        return arr[index];
       
    }
}
