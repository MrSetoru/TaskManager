package Tasks;

import Manager.TaskManager;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Task task1 = new Task(7, "Watch TV", "Easy time break");
        Task createdTask = taskManager.createTask(task1);
        Integer createdTaskId = createdTask.getId();
        Task task2 = new Task(22, "Play computer Games", "Smoke and chill");
        taskManager.createTask(task2);
        task2 = taskManager.updateTask(task2);


        System.out.println(task1);
        System.out.println(task2);
    }

}
