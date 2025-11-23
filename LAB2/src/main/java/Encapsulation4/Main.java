
package Encapsulation4;


public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setEmployeeId(1111);
        employee.setEmployeeName("Tose ");
        employee.setEmployeeSalary(4900.0);

        int employeeId = employee.getEmployeeId();
        String employeeName = employee.getEmployeeName();
        String formattedSalary = employee.getFormattedSalary();

		System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + formattedSalary);
    }
    
}

    

