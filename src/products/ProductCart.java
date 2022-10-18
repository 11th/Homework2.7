package products;

import java.util.HashSet;
import java.util.Set;

public class ProductCart {
    private Set<Product> products = new HashSet<>();

    public void add(Product product) {
        if (!products.contains(product)) {
            products.add(product);
        } else {
            throw new ProductException("Продукт " + product.getName() + " уже добавлен");
        }
    }

    public void remove(Product product) {
        if (products.contains(product)) {
            products.remove(product);
        } else {
            throw new ProductException("Продукт " + product.getName() + " не найден");
        }
    }

    public void isBought(Product product) {
        product.setBought(true);
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        if (products.isEmpty()) {
            return "Список продуктов пуст";
        }
        return "Список продуктов: " + products;
    }
}
