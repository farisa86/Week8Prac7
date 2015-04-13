import java.util.ArrayList;

/**
 * Created by jc302404 on 13/04/15.
 */
public class Stack {
    private ArrayList<String> values;

    public Stack() {
        values = new ArrayList<String>();

    }

    public void push(String value) {
        values.add(values.size(), value);
    }

    public void pop() {
        values.remove(values.size()- 1);

    }

    public String top(){
       return values.get(values.size() - 1);


    }
    public boolean isEmpty(){
        if(values.size() == 0)
            return true;
        else return false;
    }
}