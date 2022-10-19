package products;

import java.util.Objects;

public class Product {
    private final String name;
    private final double cost;
    private final double amount;
    private boolean isBought;

    public Product(String name, double cost, double amount) {
        if (name == null || name.isEmpty() || cost <= 0 || amount <= 0){
            throw new ProductException("Заполните карточку товара полностью");
        }
        this.name = name;
        this.cost = cost;
        this.amount = amount;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    public boolean isBought() {
        return isBought;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.cost, cost) == 0 && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        String bought;
        if (isBought) {
            bought = "уже куплен";
        } else {
            bought = "еще не куплен";
        }
        return String.format("\n%s, стоимость %s, %s кг, %s", name, cost, amount, bought);
    }
}
