public class Project {
    private String name;
    private String description;
    public String elevatorPitch() {
        return name + ": " + description;
    }
    public Project() {
        System.out.println("You created a project without a name or description.");
    }
    public Project(String name) {
        this.name = name;
        System.out.println("The name of this project is " + name);
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
        System.out.println("Created " + name + " project.");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        System.out.println("Changed the name of this project to " + name);
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description =  description;
        System.out.println("Changed the description of this project to: " + description);
    }
}