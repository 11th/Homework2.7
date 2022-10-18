package numbers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfIntegers {
    private Set<Integer> numbers = new HashSet<>(20);

    public void generate() {
        for (int i = 0; i < 20; i++) {
            Double value = Math.random() * (1000 - 0);
            numbers.add(value.intValue());
        }
    }

    public void removeNotEven() {
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer value = iterator.next();
            if (value % 2 != 0) {
                iterator.remove();
            }
        }
    }

    public void print() {
        for (var number : numbers) {
            System.out.println(number);
        }
    }
}
