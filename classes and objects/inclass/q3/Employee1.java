import java.util.Scanner;

 class EmployeeTest
{
    static Scanner s1 = new Scanner(System.in);

    public static void main(String args[])
    {
            String fname, lname, fname1, lname1;
            double msalary, msalary1;
            System.out.println(" Enter first name of employee 1 : ");
            fname = s1.next();
            System.out.println(" Enter last name of employee 1 : ");
            lname = s1.next();
            System.out.println(" Enter monthly salary of employee 1 : ");
            msalary = s1.nextInt();

            Employee e1 = new Employee(fname,lname,msalary);

            e1.raiseSalary();
            e1.display();

            System.out.println(" ");

            System.out.println(" Enter first name of employee 2 : ");
            fname1 = s1.next();
            System.out.println(" Enter last name of employee 2 : ");
            lname1 = s1.next();
            System.out.println(" Enter monthly salary of employee 2 : ");
            msalary1 = s1.nextInt();
            Employee e2 = new Employee(fname1,lname1,msalary1);
            e2.raiseSalary();
            e2.display();
    }
}