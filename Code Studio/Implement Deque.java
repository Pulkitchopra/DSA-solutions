public class Deque {


    int arr[];

    int front;
    int rear;
    int size;



    public Deque(int n) {
        size = n;
        arr = new int[size];

        front = -1;

        rear = -1;
    }

 
    public boolean pushFront(int x) {
        if(isFull()){


            return false;

        }

        else if(isEmpty()){

            front = 0;

            rear = 0;
        }
        else if(front == 0 && rear != size - 1){

            front = size - 1;
        }
        else{

            front--;
        }
        arr[front] = x;

        return true;
    }


    public boolean pushRear(int x) {

        if(isFull()){

            return false;
        }
        else if(isEmpty()){

            front = 0;
            rear = 0;
        }
        else if(rear == size - 1 && front != 0){
            rear = 0;
        }
        else{

            rear++;
        }





        arr[rear] = x;


        return true;    
    }

    public int popFront() {

        if(isEmpty()){
            return -1;
        }
        int ans = arr[front];

        arr[front] = -1; 

        if(front == rear){


            front = -1;
            rear = -1;
        }
        else if(front == size - 1){

            front = 0;
        }






        else{

            front++;
        }
        return ans;
    }

    
    public int popRear() {

        if(isEmpty()){

            return -1;
        }
        int ans = arr[rear];

        arr[rear] = -1; 

        if(front == rear){
            front = -1;
            rear = -1;
        }
        else if(rear == 0){

            rear = size - 1;
        }
        else{

            rear--;
        }
        return ans;     
    }

    public int getFront() {
        if(isEmpty()){
            return -1;
        }

        return arr[front];
    }


    public int getRear() {



         if(isEmpty()){
            return -1;
        }

        return arr[rear];    
    }


    public boolean isEmpty() {
        if(front == -1){

            return true;
        }
        else{
            return false;
        }
    }

   




    public boolean isFull()  {


        if((front == 0 && rear == size - 1) || ( front != 0 && rear == (front - 1) % (size - 1))){
            return true;
        }
        else{
            return false;
        }
       
    }
}
