mport java.util.Scanner;

class Employee
{
    int empId;
    String empName;
    double salary;

    // Constructor
    Employee(int id, String name, double sal)
    {
        empId = id;
        empName = name;
        salary = sal;
    }

    // Method to display employee details
    void displayEmployee()
    {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();

        Employee e = new Employee(id, name, sal);

        System.out.println("\nEmployee Details:");
        e.displayEmployee();
    }
}
