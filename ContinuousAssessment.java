import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.ListIterator;

public class ContinuousAssessment {
    static Scanner keyIn = new Scanner(System.in);
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
        Stack<Integer> stack = new Stack<Integer>();
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
                    stack.push(number);
                    System.out.println(number + " has been added to the stack");
                    break;
                case 2:
                    number = stack.pop();
                    System.out.println(number + " has been removed from the stack");
                    break;
                case 3:
                    System.out.println("stack contains " + stack.size() + " elements");
                    break;
                case 4:
                    myArray = srack.toArray();
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
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(3);
        list.add(6);
        list.add(9);
        ListIterator<Integer> listIter;
        listIter = list.listIterator();
        int choice = 0, number = 0;
        do {

            System.out.println("\nPlease select an Option from the following menu:");
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
                    System.out.print("Enter number to be added to the start of the Linked List : ");
                    number = keyIn.nextInt();
                    list.addFirst(number);
                    listIter = list.listIterator();
                    break;
                case 2:
                    System.out.print("Enter number to be added to the end of the Linked List : ");
                    number = keyIn.nextInt();
                    list.add(number);
                    listIter = list.listIterator();
                    break;
                case 3:
                    System.out.print("Enter number to be added to the current position of the Linked List : ");
                    number = keyIn.nextInt();
                    listIter.add(number);
                    break;
                case 4:
                    list.removeFirst();
                    listIter = list.listIterator();
                    System.out.println("Element has been removed from start of the Linked List");
                    break;
                case 5:
                    list.removeLast();
                    listIter = list.listIterator();
                    System.out.println("Element has been removed from end of the Linked List");
                    break;
                case 6:
                    listIter.next();
                    if(list.size() >= 1){
                        listIter.remove();
                        System.out.println("Element has been removed from current postion in the Linked List");
                    }else{
                        System.out.println("Linked List size is 0 - cannot remove any other elements");
                    }
                    break;
                case 7:
                    System.out.println("Linked List currently contains [" +list.size() +"] elements");
                    break;
                case 8:
                    listIter = list.listIterator();
                    System.out.print("Linked List contents: \n [");
                    while(listIter.hasNext()){
                        System.out.print(listIter.next() +", ");
                    }
                    System.out.println("]");
                    break;
                case 9:
                    listIter = list.listIterator(list.size());
                    System.out.print("Linked List contents (in reverse): \n [");
                    while(listIter.hasPrevious()){
                        System.out.print(listIter.previous() +", ");
                    }
                    System.out.println("]");
                    break;
                case 10:
                    break;
                default:
                    System.out.println("invalid option selected");
                    break;
            }
        } while (choice != 10);
    }
}