import java.util.Scanner;
class Stack
{
	int a[]=new int[10];
	int top;
	Stack()
	{
	top=-1;
	}
	void push(int num)
	{
	 if(isfull())
	 {
	  System.out.println("no space");
	 }
	 else
	 {
	 	top++;
	 	a[top]=num;

	 }	
	}
	void pop()
	{
		if(isempty())
		System.out.println("the stack is empty");	
	
	else
	{
		top--;
		System.out.println(a[top] + "element deleted");
	  }
	}	
	boolean isempty()
	{
       if(top==-1)
       {
       	 return true;
       }
       else 
       {
       	 return false;
       }
	}
	boolean isfull()
	{
		if(top==9)
		{
			return true;	
		}
		else
		{
			return false;
		}	
	}
	int isspaceleft()
	{
		int y;
		y=9-top;
		return y;
	}
	
}
class StackTest
{
	public static void main(String[] args) 
	{
		int choice,num,r=1;
	   Scanner s1=new Scanner(System.in);
	   Stack s=new Stack();
	   System.out.println("enter 1 to push \n enter 2 for pop \n enter 3 to check if the stack is empty \n enter 4 to check if the stack is full\n enter 5 to check if any space is left in the class");
	   do
	   {
       choice=s1.nextInt();
       switch(choice)
       {
       	case 1:
       	System.out.println("enter the numbers");
       	num=s1.nextInt();
       	s.push(5);
        break;
  
        case 2:
        s.pop();
        break;

        case 3:
        s.isempty();
        break;

        case 4:
        s.isfull();
        break;
        
        case 5:
        s.isspaceleft();
        break;

        default:
        System.out.println("the enterred value is incorrect");
           
     }
       System.out.println("do you want to continue? \t enter 1 to continue ");
        r=s1.nextInt();
    }
    while(r==1);
	}
}