package manager.controller;

import manager.Task;

public interface ControllerInterface {

    public void addTask(Task task);

    public void removeTask(int pos);

    public void editTask(int pos, Task newTask);
}
