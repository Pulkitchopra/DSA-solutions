public class Solution {
    public static void interLeaveQueue(Queue < Integer > q) {

        Queue<Integer> qpart = new LinkedList<>();
        int n = q.size();




        for(int i = 0; i < n/2; i++){

            qpart.add(q.remove());

        }

        while(!qpart.isEmpty()){

            q.add(qpart.poll());

            q.add(q.poll());
        }
    }
}
