package homework_3;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    static {
        companyName = "someCompanyName";
    }

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Company name: " + companyName);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void printEmployeeInfo() {
        System.out.println("Employee name: " + employeeName + ", Emplyee ID: " + employeeID + ", Company name: " +
                companyName);
    }
}
