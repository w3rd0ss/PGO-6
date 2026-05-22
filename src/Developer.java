public class Developer extends Employee {
    private String mainLanguage;
    private int repositoryCount;

    public Developer(String employeeId, String firstName, String lastName, double baseSalary, String mainLanguage, int repositoryCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;
    }

    @Override
    public double calculateMonthlyCost() {
        return baseSalary + (repositoryCount * 200);
    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself() + " I am a Developer writing mainly in " + mainLanguage + ".";
    }

    public void printTechnologies() {
        System.out.println("Developer " + getFirstName() + " works with: " + mainLanguage);
    }

    @Override
    public String toString() {
        return "Developer [" + super.toString() + ", Language: " + mainLanguage + ", Repos: " + repositoryCount + "]";
    }
}
