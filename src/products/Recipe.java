package products;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String name;
    private Set<Product> products = new HashSet<>();
    private double cost;

    public Recipe(String name, Set<Product> products) {
        if (name == null || name.isEmpty()) {
            throw new ProductException("Укажите наименование рецепта");
        }
        if (products.isEmpty()) {
            throw new ProductException("Укажите список продуктов");
        }
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public double getCost() {
        double cost = 0.0;
        for (Product product : products) {
            cost += product.getCost();
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
        return "\nРецепт " + name + " (Стоимость " + + getCost() + " руб.)" + "\n" + products;
    }
}
