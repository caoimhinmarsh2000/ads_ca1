import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ContinuousAssessment {
    static Scanner keyIn = new Scanner(System.in);

    // Queue que;
    public static void main(String[] args) {
        int choice = 0;
        do {

            System.out.println("Please select an Option from the following menu:");
            System.out.println("1. Stack APP");
            System.out.println("2. Queue APP");
            System.out.println("3. Linked List APP");
            System.out.println("4. Exit");
            choice = keyIn.nextInt();
            switch (choice) {
                case 1:
                    stackMenu();
                    break;
                case 2:
                    // queueMenu();
                    break;
                case 3:
                    listMenu();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("invalid option selected");
                    break;
            }
        } while (choice != 4);
    }

    static void stackMenu() {
        Stack<Integer> stk = new Stack<Integer>();
        Object[] myArray;
        int choice = 0, number = 0;
        do {

            System.out.println("Please select an Option from the following menu:");
            System.out.println("1. Add element to the Stack");
            System.out.println("2. Remove an element from the Stack");
            System.out.println("3. Display the size of the Stack");
            System.out.println("4. Display the contents of the Stack");
            System.out.println("5. Return to main menu");
            choice = keyIn.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter number to be added to the stack: ");
                    number = keyIn.nextInt();
                    stk.push(number);
                    System.out.println(number + " has been added to the stack");
                    break;
                case 2:
                    number = stk.pop();
                    System.out.println(number + " has been removed from the stack");
                    break;
                case 3:
                    System.out.println("stack contains " + stk.size() + " elements");
                    break;
                case 4:
                    myArray = stk.toArray();
                    System.out.println("stack contents : ");
                    for (Object o : myArray) {
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

        } while (choice != 5);
    }

    static void listMenu() {
        LinkedList list = new LinkedList<>();
        Object[] myArray;
        int choice = 0, number = 0, current = 0;
        do {

            System.out.println("Please select an Option from the following menu:");
            System.out.println("1. Add element at the start of the Linked List");
            System.out.println("2. Add element at the end of the Linked List");
            System.out.println("3. Add element at the current position of the Linked List");
            System.out.println("4. Remove element at the start of the Linked List");
            System.out.println("5. Remove element at the end of the Linked List");
            System.out.println("6. Remove element at the current position of the Linked List");
            System.out.println("7. Display the current size of the Linked List");
            System.out.println("8. Display the current contents of the Linked List");
            System.out.println("9. Display the current contents of the Linked List in reverse order");
            System.out.println("10. Return to main menu");
            choice = keyIn.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter number to be added to the start of the Linked List");
                    number = keyIn.nextInt();
                    list.addFirst(number);
                    break;
                case 2:
                    System.out.print("Enter number to be added to the end of the Linked List");
                    number = keyIn.nextInt();
                    list.addLast(number);
                    break;
                case 3:
                    System.out.print("Enter number to be added to the end of the Linked List");
                    number = keyIn.nextInt();
                    list.addLast(number);
                    break;
                default:
                    System.out.println("invalid option selected");
                    break;
            }
        } while (choice != 5);
    }
}