public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){


        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>(n);




        s.push(-1);



        for(int i = n-1; i >= 0; i--){

            int curr = arr.get(i);

            while(s.peek() >= curr){

                s.pop();
            }




            ans.add (s.peek());

            s.push(curr);
        }
        Collections.reverse(ans);

        return ans;

    }
}
