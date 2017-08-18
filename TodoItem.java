/**
 * Class representing a single todo item.
 *
 */
public class TodoItem{
    private String tittle;
    private boolean isDone = false;

    public TodoItem(String tittle){
    this.tittle = tittle;
    this.isDone = false;
    }

    public String getName(){
        return this.tittle;
    }
    public boolean getIsDone(){
        return this.isDone;
    }
    public void mark(){
        this.isDone = true;
    }

    public void unMark(){
        this.isDone = false;
    }
}
