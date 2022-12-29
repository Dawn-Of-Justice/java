//Program with Employee class which has Name, Age, Phone number, Address, Salary. It also has a method named 'print( . 
//Employee is extended by two classes Manger and Officer which also has Specialization and department data members.
//A menu to display full details or Name and salary of employee is also available

import java.text.DecimalFormat; //Used to change scientific notation format of phone number
import java.util.Scanner;

class Employee {
    String name;
    int age;
    double phno;
    String address;
    float salary;

    void print(){
        System.out.println("Employee name: " + name);
        System.out.println("Salary: " + salary);
    }

}

class Officer extends Employee{
    String specialization;
}
class Manager extends Employee{
    String department;
}

public class EmployeeDetails{
    public static void main(String[] args){

        Officer of = new Officer();
        Manager mg = new Manager();
        Scanner sc = new Scanner(System.in);

        //Officer data
        System.out.println("Entering data of Officer");
        System.out.print("Name: ");
        of.name = sc.nextLine();
        System.out.print("Age: ");
        of.age = sc.nextInt();
        System.out.print("Phone Number: ");
        of.phno = sc.nextDouble();
        sc.nextLine(); //To avoid skipping to next line
        System.out.print("Address: ");
        of.address = sc.nextLine();
        System.out.print("Salary: ");
        of.salary = sc.nextFloat();
        sc.nextLine(); //To avoid skipping to next line
        System.out.print("Specialization: ");
        of.specialization = sc.nextLine();

        //Manager data
        System.out.println("Entering data of Officer");
        System.out.print("Name: ");
        mg.name = sc.nextLine();
        System.out.print("Age: ");
        mg.age = sc.nextInt();
        System.out.print("Phone Number: ");
        mg.phno = sc.nextDouble();
        sc.nextLine(); //To avoid skipping to next line
        System.out.print("Address: ");
        mg.address = sc.nextLine();
        System.out.print("Salary: ");
        mg.salary = sc.nextFloat();
        sc.nextLine(); //To avoid skipping to next line
        System.out.print("Department: ");
        mg.department = sc.nextLine();

        //Display data
        int choice;
        System.out.println("What would you like to display?");
        System.out.println("1 : Print employee name and salary");
        System.out.println("2 : Print full details of employee");
        choice = sc.nextInt();
        DecimalFormat df = new DecimalFormat("#.##");//Used to change scientific notation format
        //For example, the pattern "#.00" will format the double value with two decimal places,
        //and the pattern "###,###.##" will format the double value with a comma separator for every thousand.

        if(choice == 1){
            System.out.println("Office");
            of.print();
            System.out.println("Manager");
            mg.print();
        }else if(choice == 2){
            //Details of Officer
            System.out.println("Details of Officer");
            System.out.println("Name: " + of.name);
            System.out.println("Age: " + of.age);
            System.out.println("Phone Number: " + df.format(of.phno));
            System.out.println("Address: " + of.address);
            System.out.println("Salary: " + of.salary);
            System.out.println("Specialization: " + of.specialization);
            System.out.println();

            //Details of Manager
            System.out.println("Details of Manager");
            System.out.println("Name: " + mg.name);
            System.out.println("Age: " + mg.age);
            System.out.println("Phone Number: " + df.format(mg.phno));
            System.out.println("Address: " + mg.address);
            System.out.println("Salary: " + mg.salary);
            System.out.println("Department: " + mg.department);
            System.out.println();

        }else{
            System.out.println("Invalid choice");
        }

    }
}
