package purple.POJOS;

public class Step {
    private Ingredient ingredient;
    private String action;

    public Step(Ingredient ingredient, String action) {
        this.ingredient = ingredient;
        this.action = action;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
