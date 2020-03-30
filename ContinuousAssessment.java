import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.ListIterator;

public class ContinuousAssessment {
   static Scanner kb = new Scanner(System.in);
   public static void main(String[] args) {
      int choice = 0;
      do {
      
         System.out.println("Please select an Option from the following menu:");
         System.out.println("1. Stack APP");
         System.out.println("2. Queue APP");
         System.out.println("3. Linked List APP");
         System.out.println("4. Exit");
         choice = kb.nextInt();
         switch (choice) {
            case 1:
               stackMenu();
               break;
            case 2:
               queueMenu();
               break;
            case 3:
               listMenu();
               break;
            case 4:
               System.out.print("GOODBYE");
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
         choice = kb.nextInt();
         switch (choice) {
            case 1:
               System.out.print("Enter number to be added to the stack: ");
               number = kb.nextInt();
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
               myArray = stack.toArray();
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

   static void queueMenu() {
      Queue<Integer> queue = new LinkedList<Integer>();
      int choice = 0, number = 0;
      Object myArray[];
      do {
      
         System.out.println("Please select an Option from the following menu:");
         System.out.println("1. Add element to the Queue");
         System.out.println("2. Remove an element from the Queue");
         System.out.println("3. Display the size of the Queue");
         System.out.println("4. Display the contents of the Queue");
         System.out.println("5. Return to main menu");
         choice = kb.nextInt();
         switch (choice) {
            case 1:
               System.out.print("Enter number to be added to the queue: ");
               number = kb.nextInt();
               queue.add(number);
               System.out.println(number + " has been added to the queue");
               break;
            case 2:
               number = queue.poll();
               System.out.println(number + " has been removed from the queue");
               break;
            case 3:
               System.out.println("queue contains " + queue.size() + " elements");
               break;
            case 4:
               myArray = queue.toArray();
               System.out.println("queue contents : ");
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
      ListIterator<Integer> listIter;
      listIter = list.listIterator();
      int choice = 0, number = 0, pos = 0, selection = 0;
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
         choice = kb.nextInt();
         switch (choice) {
            case 1:
               System.out.print("Enter number to be added to the start of the Linked List : ");
               number = kb.nextInt();
               list.addFirst(number);
               break;
            case 2:
               System.out.print("Enter number to be added to the end of the Linked List : ");
               number = kb.nextInt();
               list.add(number);
               break;
            case 3:
               listIter = list.listIterator();
               pos = 0;
               selection = 0;
               do{
                  System.out.println("Current positon : "  +pos);
                  System.out.println("1. Advance position in list");
                  System.out.println("2. Retreat position in list");
                  System.out.println("3. Enter number in this position");
                  System.out.println("4. Exit");
                  selection = kb.nextInt();
                  
                  switch(selection){
                     case 1:
                        if(listIter.hasNext()){
                           listIter.next();
                           pos++;
                        }else{
                           listIter = list.listIterator();
                           pos = 0;
                           System.out.println("Reset position to 0 as end of list reached");
                        }
                        break;
                     case 2:
                        if(listIter.hasPrevious()){
                           listIter.previous();
                           pos--;
                        }else{
                           pos = 0;
                           System.out.println("Position 0 reached, cannot go further");
                        }
                        break;
                     case 3:
                        System.out.print("Enter number to insert in position [" +pos +"] : ");
                        int num = kb.nextInt();
                        listIter.add(num);
                        break;
                     case 4:
                        break;
                     default:
                        System.out.print("Incorrect option entered");
                        break;
                  }
               }while(selection != 4);
               break;
            case 4:
               list.removeFirst();
               System.out.println("Element has been removed from start of the Linked List");
               break;
            case 5:
               list.removeLast();
               System.out.println("Element has been removed from end of the Linked List");
               break;
            case 6:
               listIter = list.listIterator();
               pos = 0;
               selection = 0;
               do{
                  System.out.println("Current positon : "  +pos);
                  System.out.println("1. Advance position in list");
                  System.out.println("2. Retreat position in list");
                  System.out.println("3. Remove element at this position");
                  System.out.println("4. Exit");
                  selection = kb.nextInt();
                  
                  switch(selection){
                     case 1:
                        if(listIter.hasNext()){
                           listIter.next();
                           pos++;
                        }else{
                           listIter = list.listIterator();
                           pos = 0;
                           System.out.println("Reset position to 0 as end of list reached");
                        }
                        break;
                     case 2:
                        if(listIter.hasPrevious()){
                           listIter.previous();
                           pos--;
                        }else{
                           pos = 0;
                           System.out.println("Position 0 reached, cannot go further");
                        }
                        break;
                     case 3:
                        listIter.next();
                        listIter.remove();
                        break;
                     case 4:
                        break;
                     default:
                        System.out.print("Incorrect option entered");
                        break;
                  }
               }while(selection != 4);
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