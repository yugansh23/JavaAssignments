import java.util.Scanner;

public class Employee
{
    Scanner s1 = new Scanner(System.in);

    int total;
    String[] name = new String[total];
    int[] year = new int[total];
    String[] address = new String[total];

    Employee()
    {
        total = 1;
        name[0] = " rafael ";
        year[0] = 2000;
        address[0] = " a2, janakpuri,new delhi ";
    }
    Employee(int total)
    {
        this.total=total;
        String[] name = new String[total];
        int[] year = new int[total];
        String[] address = new String[total];


        for (int i = 0; i<total ; i++)
        {
            System.out.println(" Enter the name of user " + i + " : ");
            name[i]=s1.next();
            System.out.println(" Enter the year of joining of user " + i+" : ");
            year[i]=s1.nextInt();
            System.out.println(" Enter the address of user "+ i + " : ");
            address[i]= s1.next();
        }
    }

    void display()
    {
        System.out.println("Name \t \t Year of Joining \t \t Address");

        for (int i=0; i<total; i++)
        {
            System.out.println(name[i] + " \t \t \t" + year[i] + " \t \t \t \t " + address[i]);
        }
    }


}
