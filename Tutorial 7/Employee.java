import java.util.Scanner;

class Employee {
    String name, address;
    int age, mob;
    float sal;

    void getEmployeeDetails(String name, String address, int age, int mob, float sal) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mob = mob;
        this.sal = sal;
    }

    void printSalary() {
        System.out.println("Salary: " + sal);
    }
}

class Officer extends Employee {
    String specialization;

    void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    void printSpecialization() {
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Employee {
    String department;

    void setDepartment(String department) {
        this.department = department;
    }

    void printDepartment() {
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Officer o = new Officer();

        System.out.print("Enter Officer's Name: ");
        String oname = sc.nextLine();

        System.out.print("Enter Address: ");
        String oaddress = sc.nextLine();

        System.out.print("Enter Age: ");
        int oage = sc.nextInt();

        System.out.print("Enter Mobile: ");
        int omob = sc.nextInt();

        System.out.print("Enter Salary: ");
        float osal = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter Specialization: ");
        String spec = sc.nextLine();

        o.getEmployeeDetails(oname, oaddress, oage, omob, osal);
        o.setSpecialization(spec);

        Manager m = new Manager();

        System.out.print("\nEnter Manager's Name: ");
        String mname = sc.nextLine();

        System.out.print("Enter Address: ");
        String maddress = sc.nextLine();

        System.out.print("Enter Age: ");
        int mage = sc.nextInt();

        System.out.print("Enter Mobile: ");
        int mmob = sc.nextInt();

        System.out.print("Enter Salary: ");
        float msal = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        m.getEmployeeDetails(mname, maddress, mage, mmob, msal);
        m.setDepartment(dept);

        System.out.println("\n--- Officer Details ---");
        System.out.println("Name: " + o.name);
        System.out.println("Address: " + o.address);
        System.out.println("Age: " + o.age);
        System.out.println("Mobile: " + o.mob);
        o.printSalary();
        o.printSpecialization();

        System.out.println("\n--- Manager Details ---");
        System.out.println("Name: " + m.name);
        System.out.println("Address: " + m.address);
        System.out.println("Age: " + m.age);
        System.out.println("Mobile: " + m.mob);
        m.printSalary();
        m.printDepartment();

        sc.close();
    }
}
