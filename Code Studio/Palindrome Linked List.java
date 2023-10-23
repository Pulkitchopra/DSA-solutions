public class Solution {



	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){

		LinkedListNode<Integer> curr = head;





		LinkedListNode<Integer> prev = null;

		LinkedListNode<Integer> next = null;
		
		

		while(curr != null){

			next = curr.next;

			curr.next = prev;

			prev = curr;

			curr = next;
		}

		return prev;
	}



	public static boolean isPalindrome(LinkedListNode<Integer> head) {

		if( head == null || head.next == null){

			return true;
		}


		LinkedListNode<Integer> slow = head;
		LinkedListNode<Integer> fast = head;

		while(fast != null && fast.next != null){

			slow = slow.next;


			fast = fast.next.next;
		}




		
		LinkedListNode<Integer> head1 = reverse(slow);


		while(head1 != null && head != null){
			if(!head.data.equals(head1.data)){
				return false;
			}

			head1 = head1.next;
			head = head.next;
		}
		return true;	
	}
}
