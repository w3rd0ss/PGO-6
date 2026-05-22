public class Tester extends Employee {
    private boolean automationTester;
    private int scenarioCount;

    public Tester(String employeeId, String firstName, String lastName, double baseSalary, boolean automationTester, int scenarioCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;
    }

    public boolean isAutomationTester() { return automationTester; }
    public int getScenarioCount() { return scenarioCount; }

    @Override
    public double calculateMonthlyCost() {
        if (automationTester) {
            return baseSalary * 1.10;
        }
        return baseSalary;
    }

    @Override
    public String introduceYourself() {
        String type = automationTester ? "Automation" : "Manual";
        return super.introduceYourself() + " I am an " + type + " Tester.";
    }

    public void runTestingReport() {
        System.out.println("Tester " + getFirstName() + " has run " + scenarioCount + " test scenarios.");
    }

    @Override
    public String toString() {
        return "Tester [" + super.toString() + ", Automation: " + automationTester + ", Scenarios: " + scenarioCount + "]";
    }
}

