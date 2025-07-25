public class Task {
    private final int taskId;
    private String taskName;
    private String status;

    public Task(int taskId, String taskName, String status) {
        this.taskId   = taskId;
        this.taskName = taskName;
        this.status   = status;
    }

    public int getTaskId()        { return taskId; }
    public String getTaskName()   { return taskName; }
    public String getStatus()     { return status; }

    public void setTaskName(String taskName) { this.taskName = taskName; }
    public void setStatus(String status)     { this.status = status; }

    @Override
    public String toString() {
        return String.format("Task{id=%d, name='%s', status='%s'}",
                              taskId, taskName, status);
    }
}
