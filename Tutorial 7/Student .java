import java.util.Scanner;

// Base Class: Students
class Students {
    String name;
    int rollNo;
    String course;

    void setStudentsDetails(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudentsDetails() {
        System.out.println("Name: " + name);
        System.out.println("RollNo:" + rollNo);
        System.out.println("Course: " + course);
    }
}

// Child Class 1: StudentAccount (Extends Students)
class StudentAccount extends Students {
    double collegeFee;

    void setAccountDetails(String name, int rollNo, String course, double collegeFee) {
        setStudentsDetails(name, rollNo, course);
        this.collegeFee = collegeFee;
    }

    void displayAccountDetails() {
        displayStudentsDetails();
        System.out.println("CollegeFee:" + collegeFee);
    }
}

// Child Class 2: Hosteller (Extends StudentAccount)
class Hosteller extends StudentAccount {
    double hostelFee;
    double messFee;

    void setHostellerDetails(String name, int rollNo, String course, double collegeFee, double hostelFee, double messFee) {
        setAccountDetails(name, rollNo, course, collegeFee);
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }

    void displayHostellerDetails() {
        System.out.println("\n---HOSTELLERDETAILS---");
        displayAccountDetails();
        System.out.println("HostelFee:" + hostelFee);
        System.out.println("MessFee:" + messFee);
        double totalFee = collegeFee + hostelFee + messFee;
        System.out.println("TotalFee:" + totalFee);
    }
}

// Child Class 3: DayScholar (Extends StudentAccount)
class DayScholar extends StudentAccount {
    double busFee;

    void setDayScholarDetails(String name, int rollNo, String course, double collegeFee, double busFee) {
        setAccountDetails(name, rollNo, course, collegeFee);
        this.busFee = busFee;
    }

    void displayDayScholarDetails() {
        System.out.println("\n---DAYSCHOLARDETAILS---");
        displayAccountDetails();
        System.out.println("BusFee:" + busFee);
        double totalFee = collegeFee + busFee;
        System.out.println("TotalFee:" + totalFee);
    }
}

// Main Class
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Hosteller Inputs
        System.out.print("EnterHosteller'sName: ");
        String hName = sc.nextLine();
        
        System.out.println("EnterRollNo:");
        int hRollNo = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("EnterCourse:");
        String hCourse = sc.nextLine();

        System.out.print("EnterCollegeFee: ");
        double hCollegeFee = sc.nextDouble();

        System.out.print("EnterHostelFee: ");
        double hHostelFee = sc.nextDouble();

        System.out.println("EnterMessFee:");
        double hMessFee = sc.nextDouble();
        sc.nextLine(); // Consume newline

        // DayScholar Inputs
        System.out.print("EnterDayScholar'sName: ");
        String dName = sc.nextLine();

        System.out.println("EnterRollNo: ");
        int dRollNo = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("EnterCourse: ");
        String dCourse = sc.nextLine();

        System.out.print("EnterCollegeFee: ");
        double dCollegeFee = sc.nextDouble();

        System.out.println("EnterBusFee:");
        double dBusFee = sc.nextDouble();

        // Hosteller Object
        Hosteller hosteller = new Hosteller();
        hosteller.setHostellerDetails(hName, hRollNo, hCourse, hCollegeFee, hHostelFee, hMessFee);

        // DayScholar Object
        DayScholar dayScholar = new DayScholar();
        dayScholar.setDayScholarDetails(dName, dRollNo, dCourse, dCollegeFee, dBusFee);

        // Display Outputs
        hosteller.displayHostellerDetails();
        dayScholar.displayDayScholarDetails();

        sc.close();
    }
}
