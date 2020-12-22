package purple.POJOS;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Document(collection = "Recipe")
public class Recipe {
    private String id;
    private String name;
    private String description;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Utensil> utensils;
    private ArrayList<Step> steps;
    private ArrayList<Student> students;

    public Recipe(String name, String description, ArrayList<Ingredient> ingredients, ArrayList<Utensil> utensils, ArrayList<Step> steps, ArrayList<Student> students) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.utensils = utensils;
        this.steps = steps;
        this.students = students;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Utensil> getUtensils() {
        return utensils;
    }

    public void setUtensils(ArrayList<Utensil> utensils) {
        this.utensils = utensils;
    }

    public ArrayList<Step> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<Step> steps) {
        this.steps = steps;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ingredients=" + ingredients +
                ", utensils=" + utensils +
                ", steps=" + steps +
                ", students=" + students +
                '}';
    }
}
