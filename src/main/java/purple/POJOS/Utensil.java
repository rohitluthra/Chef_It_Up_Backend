package purple.POJOS;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "Utensil")
public class Utensil {
    private String id;
    private String name;
    private String imagePath;
    private String volume;
    private String[] properties;
    private String description;

    public Utensil(String name, String imagePath, String volume, String[] properties, String description) {
        this.name = name;
        this.imagePath = imagePath;
        this.volume = volume;
        this.properties = properties;
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

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String[] getProperties() {
        return properties;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Utensil{" +
                "name='" + name + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", volume='" + volume + '\'' +
                ", properties=" + Arrays.toString(properties) +
                ", description='" + description + '\'' +
                '}';
    }
}
