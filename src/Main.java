import multiplicationTable.TaskSet;
import numbers.SetOfIntegers;
import passport.Passport;
import passport.PassportMap;
import products.Product;
import products.ProductCart;
import products.Recipe;
import products.RecipeBook;

public class Main {
    public static void main(String[] args) {
        System.out.println("***");
        ProductCart productCart = new ProductCart();
        RecipeBook recipeBook = new RecipeBook();
        try {
            Product apple = new Product("Яблоки", 50, 1);
            Product tomato = new Product("Помидоры", 70, 1);
            Product banana = new Product("Бананы", 40, 1);

            productCart.add(apple);
            productCart.add(tomato);
            productCart.add(banana);

            productCart.setBought(apple);
            productCart.remove(banana);

            recipeBook.add(new Recipe("1", productCart));
            recipeBook.add(new Recipe("2", productCart));
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
    }
}