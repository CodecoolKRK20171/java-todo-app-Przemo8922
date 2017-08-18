import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList{
    private LinkedList<TodoItem> todoList = new LinkedList<TodoItem>();
    private LinkedList<TodoItem> listToRemove = new LinkedList <TodoItem>();

    public TodoList(){
        this.todoList = todoList;
    }

    public LinkedList<TodoItem> getTodoList(){
        return this.todoList;
    }

    public void addToList(TodoItem tittle){
        this.todoList.add(tittle);
    }

    public void removeAllTask(){
        Iterator<TodoItem> iter = (this.todoList).iterator();

        while (iter.hasNext()) {
            TodoItem tittle = iter.next();

            if (tittle.getIsDone() == true) {
                iter.remove();
            }
        }
    }

    public void markAllTaskIsDone(String nameTask) {

        for (TodoItem tittle : todoList) {

            if ((tittle.getName()).equals(nameTask)) {
                tittle.mark();
            }
        }
    }

    public void printAllTask(){

        int counter = 1;

        for (TodoItem tittle : todoList) {

            if (tittle.getIsDone() == false) {
                System.out.println(counter + ". [ ] " + tittle.getName());
                counter++;
            }
            else {
                System.out.println(counter + ". [X] " + tittle.getName());
                counter++;
            }
        }
    }


}
