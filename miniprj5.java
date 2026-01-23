public class miniprj5 {
    static int taskCount = 0;

    static void addTask(String name) {
        taskCount++;
        System.out.println("Task Added : " + name);
    }

    static int getTaskCount() {
        return taskCount;
    }

    public static void main(String args[]) {
        addTask("Learned About methods !");
        addTask("Understanding the logic !");
        addTask("Commiting everything in Github !");
        System.out.println("Total Tasks Count : " + getTaskCount());
    }
}