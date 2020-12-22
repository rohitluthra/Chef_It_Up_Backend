package purple.POJOS;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Ingredient")
public class Ingredient {
    private String id;
    private String name;
    private String imagePath;
    private String type;
    private String state;
    private String description;

    public Ingredient(String name, String imagePath, String type, String state, String description) {
        this.name = name;
        this.imagePath = imagePath;
        this.type = type;
        this.state = state;
        this.description = description;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", type='" + type + '\'' +
                ", state='" + state + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
