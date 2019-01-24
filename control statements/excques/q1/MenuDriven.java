import java.util.Scanner;
class MenuDriven
{
	   public static void main(String args[])
      {
                  int x, y, z,choice;
             System.out.println("enter 1 for addition");
             System.out.println("enter 2 for subtraction");
             System.out.println("enter 3 for division ");
             System.out.println("enter 4 for multiplication");
             System.out.println("enter 5 for modulus ");
             Scanner s1 = new Scanner(System.in);
             System.out.println("enter yout choice ");
             choice=s1.nextInt();
             System.out.println("Enter two integers ");
              x = s1.nextInt();
              y = s1.nextInt();
              s1.close();
              if(choice==1)
              {
               z=x+y;
               System.out.println("the sum= " + z);
              }     
              else if(choice==2)
              {
              z=x-y;
              System.out.println("the difference= " + z);

              }
              else if(choice==3)
              {
              z=x/y;
              System.out.println("the multiplication= " + z);

              }
              else if(choice==4)
              {
              z=x*y;
              System.out.println("the division= " + z);

              }
              else if(choice==5)
              {
              z=x%y;
              }
              else 
              {
                 System.out.println("wrong input ");
                               }

  	
           }
}