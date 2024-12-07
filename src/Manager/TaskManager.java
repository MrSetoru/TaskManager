package Manager;

import Tasks.*;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager {
    private final HashMap<Integer, Task> tasks = new HashMap<>();
    private final HashMap<Integer, Subtask> subtasks = new HashMap<>();
    private final HashMap<Integer, Epic> epic = new HashMap<>();
    private int countId = 0;

    public Task createTask(Task task) {
        int newId = generateId();
        task.setId(newId);
        tasks.put(task.getId(), task);
        return task;
    }

    public Task updateTask(Task task) {
        if (tasks.containsKey(task.getId())) {
            Task equalingTask = tasks.get(task.getId());
            equalingTask.setName(task.getName());
            equalingTask.setDescription(task.getDescription());

        }
        return task;
    }

    public Task deleteTask(Integer id) {
        return tasks.remove(id);
    }

    public ArrayList<Task> findAllTask() {
        return new ArrayList<>(tasks.values());
    }

    public Task findTaskById(Integer id) {

        return null;
    }

    private int generateId() {
        return countId++;
    }

    public Epic updateEpic(Epic epic) {

        return epic;
    }

    public Subtask createSubtask(Subtask newSubtask) {

        return newSubtask;
    }

    public Subtask updateSubtask(Subtask subtask) {

        return subtask;
    }


}

