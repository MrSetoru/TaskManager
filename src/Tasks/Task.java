package Tasks;

public class Task {
    private Integer id;
    private String name;
    private String description;
    //private String taskStatus;


    public Task(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString (){
        String result = "Task " + "{ id = " + getId() + "," + " name = " + getName() + "," +
                         " description = " + getDescription() + " }";
        return result;
    }
}
