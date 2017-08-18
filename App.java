import java.util.Scanner;

/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */

public class App {

    private static Scanner inputForUser = new Scanner(System.in);
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {

        String userInput = "";

        while(!userInput.equals("0")) {

            printMenu();
            userInput = inputForUser.nextLine();

            if (userInput.equals("1")) {
                printList();
            }

            else if(userInput.equals("2")) {
                addItem();
            }

            else if(userInput.equals("3")) {

                markAllTaskIsDone();
            }

            else if(userInput.equals("4")) {
                todoList.removeAllTask();
            }
        }
    }

    public static void printList() {

        if ((todoList.getTodoList()).isEmpty()) {
            System.out.println("Tittle list is empty.\n");
        }

        else{
            todoList.printAllTask();
            System.out.println();
        }
    }

    public static void addItem() {

        System.out.println("Input tittle task: ");
        String tittleName = inputForUser.nextLine();
        System.out.println();

        TodoItem tittle = new TodoItem(tittleName);

        todoList.addToList(tittle);
    }

    public static void markAllTaskIsDone() {

        System.out.println("Input tittle task to mark is done: ");
        String nameTask = inputForUser.nextLine();
        todoList.markAllTaskIsDone(nameTask);
        System.out.println();
    }

    public static void printMenu() {

        System.out.println("Choice option: \n" +
                           "1. Print all tasks.\n" +
                           "2. Add task\n" +
                           "3. Marking a task as done\n" +
                           "4. Remove all done task.\n" +
                           "0. Exit");
    }
}
