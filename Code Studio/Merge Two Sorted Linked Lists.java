public class Solution {



    public static LinkedListNode<Integer> solve(LinkedListNode<Integer> first, LinkedListNode<Integer> second){

        if(first.next == null){
            first.next = second;
            return first;
        }


        LinkedListNode<Integer> curr1 = first;

        LinkedListNode<Integer> next1 = curr1.next;

        LinkedListNode<Integer> curr2 = second;

        LinkedListNode<Integer> next2 = curr2.next;

        while(next1 != null && curr2 != null){

            if(curr2.data >= curr1.data && curr2.data <= next1.data){

                curr1.next = curr2;

                next2 = curr2.next;

                curr2.next = next1;

                curr1 = curr2;



                curr2 = next2;
            }
            else{

                curr1 = next1;

                next1 = next1.next;

                if(next1 == null){


                    curr1.next = curr2;
                    return first;
                }
            }
        }
        return first;
    }





	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		

        if(first == null){
            return second;
        }
        if(second == null){

            return first;
        }

        if(first.data <= second.data){

            return solve(first, second);
        }
        else{


         return solve(second, first);
        }
	}
}
