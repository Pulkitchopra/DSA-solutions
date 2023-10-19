public class Solution {

  public static Node floydDetectLoop( Node head){

    if(head == null){
      return null;
    }





    Node slow = head;

    Node fast = head;

    while(slow != null && fast != null){

      fast = fast.next;

      if(fast != null){

        fast = fast.next;
      }
      slow = slow.next;

      if(slow == fast){

        return slow;
      }
    }
    

    return null;
  }

  public static Node getStartingNode(Node head){

    if(head == null){

      return null;
    }
    Node intersection = floydDetectLoop(head);


    if(intersection == null){
      return null;
    }
    Node slow = head;

   
   
   
   
   
   
   
    while(slow != intersection){


      slow = slow.next;
      intersection = intersection.next;
    }
    return slow;
  }

  public static Node removeLoop(Node head) {
   
   if(head == null){
     return null;
   }

   Node startOfLoop = getStartingNode(head);


   if(startOfLoop == null){

     return head;
   }

   Node temp = startOfLoop;




   while(temp.next != startOfLoop){


     temp = temp.next;
   }








   temp.next = null;

   return head;

  }
}
