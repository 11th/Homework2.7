package multiplicationTable;

import java.util.HashSet;
import java.util.Set;

public class TaskSet {
    private Set<Task> tasks = new HashSet<>(15);

    public void generate() {
        while (tasks.size() < 15) {
            tasks.add(new Task(getRandomInt(), getRandomInt()));
        }
    }

    private int getRandomInt() {
        Double value = (Math.random() * (10 - 2)) + 2;
        return value.intValue();
    }

    public void print() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public Set<Task> getTasks() {
        return tasks;
    }
}
