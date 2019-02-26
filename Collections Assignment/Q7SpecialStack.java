import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

class SpecialStack{
    Stack<Integer> stack;
    int rear;
    int capacity;
    int minEle;
    SpecialStack(int capacity){
        stack=new Stack<>();
        rear=-1;
        this.capacity=capacity;
    }
    int pop() throws EmptyStackException {
        if (rear >= 0) {
            rear--;
            return(stack.pop());
        }
        else {
            throw new EmptyStackException();
        }
    }
    void push(int ele) throws StackOverflowError{
        if(rear+1==capacity){
            throw new StackOverflowError();
        }
        else {
            rear++;
            if(rear==0){
                minEle=ele;
            }
            else{
                if(minEle>ele){
                    minEle=ele;
                }
            }
            stack.add(ele);
        }
    }
    boolean isEmpty(){
        if(rear==-1)
            return true;
        else
            return false;
    }
    boolean isFull(){
        if(rear+1==capacity)
            return true;
        else
            return false;
    }
    int getMin() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            return minEle;
        }
    }
    int size(){
        return rear+1;
    }

    @Override
    public String toString(){
        if(rear==-1){
            System.out.println("Stack is empty");
        }
        return stack.toString();
    }
}

public class Q7SpecialStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter capacity of stack: ");
        int capacity=sc.nextInt();
        SpecialStack stack=new SpecialStack(capacity);
        char cont;
        do{
            System.out.print("\n1. push\t2. pop\t3. isEmpty\t4. isFull\n5.getMinimumElement\t6. getSize\t7.Display\n\nEnter your choice: ");
            char ch=sc.next().charAt(0);
            switch (ch){
                case '1':
                    System.out.print("Enter integer to be pushed: ");
                    try {
                        stack.push(sc.nextInt());
                    }
                    catch (StackOverflowError e){
                        System.out.println("Stack is full");
                    }
                    break;
                case '2':
                    try {
                        System.out.println("Popped element: "+stack.pop());
                    }
                    catch (EmptyStackException e){
                        System.out.println("Stack is empty");
                    }
                    break;
                case '3':
                    System.out.println("stack.isEmpty(): "+stack.isEmpty());
                    break;
                case '4':
                    System.out.println("stack.isFull(): "+stack.isFull());
                    break;
                case '5':
                    try {
                        System.out.println("minimum element: "+stack.getMin());
                    }
                    catch (EmptyStackException e){
                        System.out.println("Stack is empty");
                    }
                    break;
                case '6':
                    System.out.println("size: "+stack.size());
                    break;
                case '7':
                    System.out.println(stack);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.print("Want to continue?(Y/N): ");
            cont = sc.next().charAt(0);
        }while (cont=='Y'||cont=='y');
    }
}

