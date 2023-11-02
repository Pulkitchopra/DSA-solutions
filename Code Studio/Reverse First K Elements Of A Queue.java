public class Solution 
{
  public static Queue<Integer> reverseElements(Queue<Integer> q, int k) {


    Stack<Integer> s = new Stack<>();





    for(int i = 0; i < k; i++){
      int val = q.peek();
      q.remove();

      s.push(val); 
    }


    while(!s.empty()){

      int val = s.peek();
      s.pop();


      q.add(val);

    }

    for(int i = 0; i < q.size() - k; i++){

      q.add(q.poll());
    }


    return q;
  
  }
}
