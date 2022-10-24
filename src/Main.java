import multiplicationTable.TaskSet;
import numbers.SetOfIntegers;
import passport.Passport;
import passport.PassportMap;
import phoneBook.PhoneBook;
import products.Product;
import products.ProductCart;
import products.Recipe;
import products.RecipeBook;
import simpleMap.SimpleMap;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("***");
        ProductCart productCart = new ProductCart();
        RecipeBook recipeBook = new RecipeBook();
        try {
            Product apple = new Product("Яблоки", 50);
            Product tomato = new Product("Помидоры", 70);
            Product banana = new Product("Бананы", 40);

            productCart.add(apple);
            productCart.add(tomato);
            productCart.add(banana);
            productCart.setBought(apple);
            productCart.remove(banana);

            Recipe recipe1 = new Recipe("1");
            recipe1.addProduct(apple, 1.0);
            recipe1.addProduct(banana, 1.0);
            Recipe recipe2 = new Recipe("2");
            recipe2.addProduct(tomato, 1.5);
            recipeBook.add(recipe1);
            recipeBook.add(recipe2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(recipeBook);
        }

        System.out.println("***");
        SetOfIntegers set = new SetOfIntegers();
        set.generate();
        set.removeNotEven();
        set.print();

        System.out.println("***");
        TaskSet taskSet = new TaskSet();
        taskSet.generate();
        taskSet.print();

        System.out.println("***");
        PassportMap passports = new PassportMap();
        Passport p1 = new Passport(1444742777, "Иванов", "Иван", "Иванович", "11.11.1990");
        Passport p2 = new Passport(1444742888, "Сноудон", "Эдвард", "12.12.1990");
        Passport p3 = new Passport(1444742888, "Сноуден", "Эдвард", "12.12.1990");
        passports.add(p1);
        passports.add(p2);
        passports.add(p3);
        System.out.println(passports.findByNumber(1444742888));

        System.out.println("***");
        for (int i = 1; i <= 20; i++) {
            PhoneBook.add("Имя" + i, "+7" + i + i + i);
        }
        PhoneBook.print();
        System.out.println(PhoneBook.findByName("Имя1"));
        System.out.println(PhoneBook.findByPhone("+7111"));

        System.out.println("***");
        try {
            SimpleMap.add("str1", 1);
            SimpleMap.add("str2", 2);
            SimpleMap.add("str1", 11);
            SimpleMap.add("str1", 11);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            SimpleMap.print();
        }

        System.out.println("***");
        Map<String, List<Integer>> mapBefore = new HashMap<>();
        Map<String, Integer> mapAfter = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            mapBefore.put("String" + i, new ArrayList<>(List.of(getRandomInt(), getRandomInt(), getRandomInt())));
        }
        System.out.println(mapBefore);

        for (String s : mapBefore.keySet()) {
            int value = 0;
            for (Integer num : mapBefore.get(s)) {
                value += num;
            }
            mapAfter.put(s, value);
        }
        System.out.println(mapAfter);

        System.out.println("***");
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        for (int i = 1; i <= 10; i++) {
            linkedMap.put(i, "String" + i);
        }
        for (Map.Entry<Integer, String> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    private static int getRandomInt() {
        return ThreadLocalRandom.current().nextInt(0, 100);
    }
}