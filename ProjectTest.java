public class ProjectTest {
    public static void main(String[] args) {
        System.out.println("Using methods on Project class without setting name and description:");
        Project proj = new Project();
        System.out.println("Name: " + proj.getName()); // Returns null because we did not give this project a name.
        System.out.println("Description: " + proj.getDescription()); //Returns null because we did not give this project a description.
        proj.setName("Chemistry");
        proj.setDescription("This project is focused on the electronegativity of the halogens.");
        System.out.println(proj.elevatorPitch());
        System.out.println("");

        System.out.println("Creating a project with a name but no description:");
        Project namedProj = new Project("Machine Learning");
        System.out.println("Name: " + namedProj.getName());
        System.out.println("Description: " + namedProj.getDescription());
        namedProj.setDescription("In this project, our goal is to create a working Machine Learning model.");
        System.out.println(namedProj.elevatorPitch());
        System.out.println("");

        System.out.println("Creating a project with a name and description:");
        Project goodProj = new Project("Psychology", "This project's goal is to explore how humans make important decisions.");
        System.out.println("Name: " + goodProj.getName());
        System.out.println("Description: " + goodProj.getDescription());
        System.out.println(goodProj.elevatorPitch());
    }
}
