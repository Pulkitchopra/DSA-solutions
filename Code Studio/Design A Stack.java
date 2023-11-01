public class Solution {
    static class SpecialStack {


        Stack<Integer> s = new Stack<>();

        int min;





        void push(int data) {
            if(s.empty()){
                s.push(data);

                min = data;
            }
            else{

                if(data < min){

                    s.push(2 * data - min);
                    min = data;
                }

                else{

                    s.push(data);
                }

            }
        }

        void pop() {

            if(s.empty()){
                return;
            }
            int curr = s.peek();

            
            if(curr < min){

                min = 2 * min - curr;

                s.pop();


            }
            else{

                s.pop();
            }
        }
        


        int top() {
            if(s.empty()){
                return -1;
            }

            int curr = s.peek();






            if(curr < min){


                return min;
            }
            else{
                return curr;
            }
        }
        int getMin() {
           


           return min;
        }
    };
}
