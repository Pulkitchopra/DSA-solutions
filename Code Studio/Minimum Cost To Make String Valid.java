public class Solution {
    public static int findMinimumCost(String str) {

      if(str.length() % 2 == 1){

        return -1;
      }




      Stack<Character> s = new Stack<>();

      for(int i = 0; i < str.length(); i++){

        char ch = str.charAt(i);

        if(ch == '{'){

          s.push(ch);
        }
        else{
          if(!s.empty() && s.peek() == '{'){






            s.pop();
          }
          

          else{

            s.push(ch);
          }
        }
      }


      int m = 0; int n = 0;

      while(!s.empty()){

        if(s.peek() == '{'){



          n++;
        }
        else{

          m++;
        }
        s.pop();
      }

      int ans = (m+1)/2 + (n+1)/2;

      return ans;

    }
}
