package products;

import java.util.HashSet;
import java.util.Set;

public class RecipeBook {
    private final Set<Recipe> recipes = new HashSet<>();

    public void add(Recipe recipe) {
        if (!recipes.contains(recipe)){
            recipes.add(recipe);
        } else {
            throw new ProductException("Рецепт " + recipe.getName() + " уже добавлен");
        }
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    @Override
    public String toString() {
        if (recipes.isEmpty()){
            return "Список рецептов пуст";
        }
        return "Список рецептов: " + recipes;
    }
}
