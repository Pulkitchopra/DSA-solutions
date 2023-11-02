public class Solution {

    public static Queue<Integer> reverseQueue(Queue<Integer> q) {

      Stack<Integer> s = new Stack<>();
      while(!q.isEmpty()){




        int element = q.peek();
        q.remove();
        s.push(element);

      }

      while(!s.isEmpty()){

        int element = s.peek();

        s.pop();
        q.add(element);
      }

      return q;
      
    }
  }
