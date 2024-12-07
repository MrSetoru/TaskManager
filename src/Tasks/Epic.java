package Tasks;

import java.util.ArrayList;

public class Epic extends Task{
    ArrayList<Integer> subtasks;

    public Epic(Integer id, String name, String description) {
        super(id, name, description);
    }
}
