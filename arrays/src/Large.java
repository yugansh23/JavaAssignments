import java.util.Scanner;
class Large
{
	public static void main(String args[])
	{ int ch;
		double sum=0;
    int sum1=0;
    int count,temp1,temp2;

	Scanner s = new Scanner(System.in);
int a[] = new int[5];
System.out.println("Enter all the elements:");
   for(int i = 0; i < 5; i++)
{
  a[i] = s.nextInt();
  }
  System.out.println("now enter your choice:");
  System.out.println("1-sum 2-largest  3-smallest  4-sum of alternate elements 5-count even no ");
  ch=s.nextInt();
  switch(ch)
  {
  case 1:
  for(int i = 0; i < 5; i++)
   sum = sum + a[i];
System.out.println("sum :"+sum);
break;
case 2:
for (int i = 0; i < 5; i++)
      {for(int j = i + 1; j < 5; j++)
       {
       if(a[i] < a[j])
       {
        temp1 = a[i];
        a[i] = a[j];
        a[j] = temp1;
       }
        }
        }
        System.out.println("Largest two numbers are:"+a[0]+" and "+a[1]);
      break;
      case 3:
      for(int i = 0; i<5; i++ )
        {
         for(int j = i+1; j<5; j++)
         {
            if(array[i]>array[j])
            {
               temp2 = array[i];
               array[i] = array[j];
               array[j] = temp2;
            }
         }
      }
      System.out.println("Smallest element of the array is:: "+array[0]);
       break;
       case 4:
       for(int i = 0; i <5;i++)
{  sum1 = sum1 + a[i+2];
}System.out.println("Sum:"+sum1);
break;
case 5:
for(int i = 0; i<5; i++ )
  {
    if(a[i]%2=0)
    count++;
}
  System.out.println("even no count"+count); 
  default:
  System.out.println("system error");

}
	}
}