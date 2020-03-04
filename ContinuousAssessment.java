import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Random;

public class ContinuousAssessment{
    static Scanner keyIn = new Scanner(System.in);
    //Queue que;
    //LinkedList list;
    public static void main(String[] args){  
        int choice = 0;
        do{
            
            System.out.println("Please select an Option from the following menu:");
            System.out.println("1. Stack APP");
            System.out.println("2. Queue APP");
            System.out.println("3. Linked List APP");
            System.out.println("4. Exit");
            choice = keyIn.nextInt();
            switch(choice){
                case 1:
                    stackMenu();
                    break;
                case 2:
                    //queueMenu();
                    break;
                case 3:
                    //listMenu();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("invalid option selected");
                    break;
            }
        }while(choice != 4);
    }

    static void stackMenu(){
        Stack<Integer> stk = new Stack<Integer>();
        Random rand = new Random();
        Object[] myArray;
        int choice = 0, number = 0;
        do{
            
            System.out.println("Please select an Option from the following menu:");
            System.out.println("1. Add element to the Stack");
            System.out.println("2. Remove an element from the Stack");
            System.out.println("3. Display the size of the Stack");
            System.out.println("4. Display the contents of the Stack");
            System.out.println("5. Return to main menu");
            choice = keyIn.nextInt();
            switch(choice){
                case 1:
                    number = rand.nextInt(10);
                    stk.push(number);
                    System.out.println(number +" has been added to the stack");
                    break;
                case 2:
                    number = stk.pop();
                    System.out.println(number +" has been removed from the stack");
                    break;
                case 3: 
                myArray = stk.toArray();
                number = 0;
                for(int i = 0; i < myArray.length; i++){
                    number++;
                }
                System.out.println("stack contains " +number +" elements");
                    break;
                case 4:
                    myArray = stk.toArray();
                    System.out.println("stack contents : ");
                    for(Object o : myArray){
                        System.out.println(o);
                    }
                    System.out.println(" - - - - - - - ");
                    break;
                case 5:
                    System.out.println("returning to main menu");
                    break;
                default:
                    System.out.println("invalid option selected");
                    break;
            }

        }while(choice != 5);
    }
    static void queueMenu(){
        Queue<Integer> queue = new Queue<Integer>();
        Random rand = new Random();
        Object [] myArray;
        int choice = 0, number = 0;
        do{
            
            System.out.println("Please select an Option from the following menu:");
            System.out.println("1. Add element to the Queue");
            System.out.println("2. Remove an element from the Queue");
            System.out.println("3. Display the size of the Queue");
            System.out.println("4. Display the contents of the Queue");
            System.out.println("5. Return to main menu");
            choice = keyIn.nextInt();
            switch(choice){
                case 1:
                    number = rand.nextInt(10);
                    queue.offer(number);
                    System.out.println(number +" has been added to the queue");
                    break;
                case 2:
                    number = queue.poll();
                    System.out.println(number +" has been removed from the stack");
                    break;
                case 3:
                    System.out.println("the queue contains " +queue.size() +" numbers");
                    break;
                case 4:
                    myArray = queue.toArray();
                    System.out.println("queue contents : ");
                    for(Object o : myArray){
                        System.out.println(o);
                    }
                    System.out.println(" - - - - - - - ");
                    break;
                case 5:
                    System.out.println("returning to main menu");
                    break;
                default:
                    System.out.println("invalid option selected");
                    break;
            }
        }while(choice != 5);
    }
}