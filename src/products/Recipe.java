package products;

import java.util.*;

public class Recipe {
    private final String name;
    private Map<Product, Double> products = new HashMap<>();
    private double cost;

    public Recipe(String name) {
        if (name == null || name.isEmpty()) {
            throw new ProductException("Укажите наименование рецепта");
        }
        this.name = name;
    }

    public void addProduct(Product product, double amount) {
        if (product == null){
            throw new RuntimeException("Укажите продукт");
        }
        if (amount < 0){
            throw new RuntimeException("Количество не может быть отрицательным");
        } else if (amount == 0) {
            products.put(product, 1.0);
        } else {
            products.put(product, amount);
        }
    }

    public String getName() {
        return name;
    }

    public Map<Product, Double> getProducts() {
        return products;
    }

    public double getCost() {
        double cost = 0.0;
        for (Map.Entry<Product, Double> entry : products.entrySet()) {
            cost += entry.getKey().getCost() * entry.getValue();
        }
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nРецепт " + name + " (Стоимость " + getCost() + " руб.)" + "\n" + "Продукты:");
        for (Product product : products.keySet()) {
            stringBuilder.append(product);
        }
        return stringBuilder.toString(); //"\nРецепт " + name + " (Стоимость " + getCost() + " руб.)" + "\n" + products;
    }
}
