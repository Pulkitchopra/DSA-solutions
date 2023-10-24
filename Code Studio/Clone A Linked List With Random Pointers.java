public class Solution {

    public static void insertAtTail(Node head, Node tail, int d){

        Node temp = new Node(d);

        if(head == null){

            head = temp;
            tail = temp;

            return;
        }   
        else{
            tail.next = temp;

            tail = temp;


        }
    }

    public static Node cloneLL(Node head) {

        Node cloneHead = null;

        Node cloneTail = null;

        Node temp = head;
        while (temp != null){

            insertAtTail(cloneHead, cloneTail, temp.data);
            temp = temp.next;
        }


        Node originalNode = head;






        Node cloneNode = cloneHead;


        while(originalNode != null && cloneNode != null){

            Node next = originalNode.next;


            originalNode.next = cloneNode;


            originalNode = next;

            next = cloneNode.next;

            cloneNode.next = originalNode;


            cloneNode = next;   
        }

        temp = head;









        while(temp != null){

            if(temp.next != null){





                if(temp.random != null){
                temp.next.random = temp.random.next; 
                }

                else{

                    temp.next = temp.random;   
                }
            }





            
            
            temp = temp.next.next;
        }

        originalNode = head;
        cloneNode = cloneHead;

         while(originalNode != null && cloneNode != null){

             originalNode.next = cloneNode.next;
             originalNode = originalNode.next;
             if(originalNode != null){

                 cloneNode.next = originalNode.next;
             }
             cloneNode = cloneNode.next;
         }
         return cloneHead; 
    }
}
