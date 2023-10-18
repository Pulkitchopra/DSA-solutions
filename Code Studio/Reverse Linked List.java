public class Solution 

{

    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 

    {







		  if( head == null || head.next == null){

		   return head;
	   }


	   LinkedListNode prev = null;

	   LinkedListNode curr = head;

	   LinkedListNode forward = null;

	   while(curr != null){

		   forward = curr.next;
		   
		   curr.next = prev;

		   prev = curr;



		   curr = forward;


	   }
	   return prev;
    }
}
