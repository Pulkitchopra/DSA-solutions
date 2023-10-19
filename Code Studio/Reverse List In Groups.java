public class Solution {
    public static Node kReverse(Node head, int k) {


        Node curr1 = head;

        for(int i =0; i < k; i++){

        if(curr1 == null){
            return head;
        }

        curr1 = curr1.next;
        }
        Node temp = null;

        Node curr = head;

        Node prev = null;



        int count = 0;

        while(curr != null && count < k){

            temp = curr.next;

            curr.next = prev;

            prev = curr;
            curr = temp;

            count++;
        }
        if(temp != null){
            head.next = kReverse(temp, k);
        }
        return prev;
    }
}
