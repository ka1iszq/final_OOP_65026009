import java.lang.reflect.Array;
import java.util.ArrayList;

class Employee01 {
    private String Name;
    private double Age;
    private String Position;
    private String EmpID;
    protected ArrayList<Project> myProject;

    public interface Person {
        String getName();

        void setName(String name);

        int getAge();

        void setAge(int age);
    }

    public interface job {
        String getPosition();

        void setPosition(String position);

        String getEmpID();

        void setEmpID(String EmpID);
    }

    public class Project {
        private String projectName;

        public Project(String projectName) {
            this.projectName = projectName;
        }

        public String getDescription() {
            return "This is a project name " + projectName;
        }

        public String getProjectName() {
            return projectName;
        }

        public static void main(String[] args) {
            Project project1 = new Project("WEB A")
            System.out.println("Project Name: " + project1.getProjectName());
            System.out.println("Project Description: " + project1.getDescription());
        }

        public static void main(String[] args) {
            Employee Emp1 = new Employee();
            Emp1.Name = "Tom"
        }

    }

    public void ShowDetails() {
        System.out.println("Name : " + this.Name);
        System.out.println("Position : " + this.Position);
        System.out.println("EmpID : " + this.EmpID);
        employee.addProject(project1);

    }

}
