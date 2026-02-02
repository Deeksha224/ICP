package stack_implementations;
public class Array_Based {
    int arr[];
    int top;
    int index;

    //constructor to initialize stack
    public Array_Based(int size){
        arr = new int[size];
        top = -1;
        index = size;
    }

    // push operation
    public void push(int data){
        if (top == index - 1){
            System.out.println("Stack Overflow");
        } 
        else {
            arr[top++] = data;
        }
    }

    // pop operation
    public int pop(){
        if (top == -1){
            System.out.println("Stack Underflow");
            return -1;  
        }
        else {
            int element = arr[top];
            top--;
            return element;
        }
    }

    // peek operation
    public int peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return arr[top];
        }
    }

    // isEmpty operation
    public boolean isEmpty(){
        return top == -1;
    }

    // isFull operation
    public boolean isFull(){
        return top == index - 1;    
    }
}