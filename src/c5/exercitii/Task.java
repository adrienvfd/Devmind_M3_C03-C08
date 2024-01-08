package c5.exercitii;

public class Task {

    private String taskName;
    private Integer taskId;
    private Integer executionTime;
    private static Integer numberOfTasks;

    public void run() {
        try {
            Thread.sleep(executionTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Integer generateId() {
        if(numberOfTasks == null) {
            numberOfTasks = 0;
        }
        return ++numberOfTasks;
    }

    private void init() {
        this.taskId = generateId();
        this.taskName = "Task " + taskId;
        this.executionTime = (int) ((Math.random() % 20) + 1);
        System.out.println("Task with taskId = [" + taskId + "] and name = [" + taskName + "] created");
    }


    void destroy() {
        System.out.printf("Task with taskId = [%s] and name = [%s] destroyed. New Number of Tasks: %d%n", taskId, taskName, --numberOfTasks);
    }
}
