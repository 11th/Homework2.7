package products;

import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String name;
    private ProductCart products;

    public Recipe(String name, ProductCart products) {
        if (name == null || name.isEmpty()) {
            throw new ProductException("Укажите наименование рецепта");
        }
        if (products.getProducts().isEmpty()) {
            throw new ProductException("Укажите список продуктов");
        }
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products.getProducts();
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
        return "\nРецепт " + name + "\n" + products;
    }
}
