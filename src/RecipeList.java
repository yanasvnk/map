import java.util.Set;

public class RecipeList {
    private Set<Recipe> recipes;
    private String productList;

    public RecipeList(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void add(Recipe recipe) {
        if (this.recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть!");
        } else {
            this.recipes.add(recipe);
        }
    }

    public void remove(Recipe recipe) {
        this.recipes.remove(recipe);
    }

    public String toString() {
        return this.recipes.toString();
    }

}
