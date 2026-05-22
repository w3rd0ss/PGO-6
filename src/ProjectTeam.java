import java.util.ArrayList;

public class ProjectTeam {
    private String projectName;
    private ArrayList<Employee> employees;

    public ProjectTeam(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printTeamMembers() {
        System.out.println("--- Team Members for Project: " + projectName + " ---");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
        System.out.println("---------------------------------------------");
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Employee emp : employees) {
            total += emp.calculateMonthlyCost();
        }
        return total;
    }

    public Employee findById(String employeeId) {
        for (Employee emp : employees) {
            if (emp.getEmployeeId().equals(employeeId)) {
                return emp;
            }
        }
        return null;
    }

    public void printDevelopers() {
        System.out.println("Developers in team:");
        for (Employee emp : employees) {
            if (emp instanceof Developer) {
                System.out.println("- " + emp.getFirstName() + " " + emp.getLastName());
            }
        }
    }
}
