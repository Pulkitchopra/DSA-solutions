public class Solution {

    public static Node merge(Node left, Node right){

        Node temp = new Node(-1);

        Node ans = temp;

        while(left != null & right != null){

            if(left.data < right.data){

                temp.child = left;
                temp = temp.child;
                left = left.child;
            }




            else{

                temp.child = right;

                temp = temp.child;

                right = right.child;
            }
        }


        if( left != null){
            temp.child = left;
        }
        else{

            temp.child = right;
        }





        return ans.child;
    }

    public static Node flattenLinkedList(Node head) {

        if(head == null || head.next == null){
            return head;
        }

        head.next = flattenLinkedList(head.next);

        head = merge(head, head.next);

        return head;
    }
}
