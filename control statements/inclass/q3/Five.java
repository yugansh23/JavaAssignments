import java.util.Scanner;
class Five
{
	public static void main(String args[])
	{
	int a;
	int b,c,d,e,f,g,h,i;
	Scanner x=new Scanner(System.in);
	System.out.println("Enter five digit number");
	a= x.nextInt();
	b=a/10000;
	c=a%10000;
	d=c/1000;
	e=c%1000;
	f=e/100;
	g=e%100;
	h=g/10;
	i=g%10;

	
	System.out.println("First no" +b);
	System.out.println("Second no" +d);
	System.out.println("Third no is" +f);
	System.out.println("Fourth no is" +h);
	System.out.println("FIfth no is" +i);
}




}