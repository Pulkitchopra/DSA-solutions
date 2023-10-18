public class Solution

{

    public static int getLength(Node head){

        int length = 0;

        while(head != null){

            length++;
            head = head.next;
        }
        return length; 
    }

    public static Node findMiddle(Node head)
    {






        int length = getLength(head);

        int ans = (length/2);

        Node temp = head;
        
        int count = 0;

        while(count < ans){


            temp = temp.next;
            count++;
        }
        return temp;
    }
}
