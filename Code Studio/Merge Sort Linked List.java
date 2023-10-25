public class Solution {


    public static Node<Integer> getMid(Node<Integer> head){

        Node<Integer> slow = head;

        Node<Integer> fast = head.next;

        while(fast != null && fast.next != null){





            slow = slow.next;

            fast = fast.next.next;
        }
        return slow;
    }


    public static Node<Integer> merge(Node<Integer> left, Node<Integer> right){

        if(left == null){
            return right;
        }

        if(right == null){
            return left;
        }

        Node<Integer> ans  = new Node(-1);
        
        
        
        Node<Integer> temp = ans; 
        
        while(left != null && right != null){

            if(left.data < right.data){

            temp.next = left;

            temp = left;
            left = left.next; 
            }
            else{
                temp.next = right;
                temp = right;
                right = right.next;    
            }
        }






        while(left != null){
            
            
            temp.next = left;
            temp = left;
            left = left.next;  
        }

        while(right != null){
            temp.next = right;
            temp = right;
            right = right.next;
        }
        ans = ans.next;
        return ans; 
    }


    public static Node<Integer> mergeSort(Node<Integer> head) {


        if( head == null || head.next == null){
            return head;
        }







        Node<Integer> mid = getMid(head);

        Node<Integer> left = head;





        Node<Integer> right = mid.next;

        mid.next = null;

        left = mergeSort(left);

        right = mergeSort(right);

        Node<Integer> result = merge(left, right);
        
        return result;
    }
}
