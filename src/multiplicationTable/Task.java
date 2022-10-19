package multiplicationTable;

import java.util.Objects;

public class Task {
    private int num1;
    private int num2;
    private int result;

    public Task(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = num1 * num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getResult() {
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return (num1 == task.num1 && num2 == task.num2) || (num1 == task.num2 && num2 == task.num1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        return String.format("%d * %d = ?",num1,num2);
    }
}
