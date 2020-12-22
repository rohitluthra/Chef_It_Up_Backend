package purple.POJOS;

public class ClassNew {
    private String name;
    private String description;
    private String instructor;

    private ClassNew(String name, String description, String instructor) {
        this.name = name;
        this.description = description;
        this.instructor = instructor;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
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
}
