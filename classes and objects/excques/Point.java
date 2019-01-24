class Point
{
	private double x1;
	private double x2;
	private double y1;
	private double y2;

	Point()
    {
    	System.out.println("nothing");

     }
    Point( Double x1, Double y2)
    {
    	this.x1=x1;
    	this.y2=y2;	
    } 
      Point(Double x1,Double x2,Double y1,Double y2) 
      {
         this.x1=x1;
    	 this.x2=x2;
    	 this.y1=y1;
    	 this.y2=y2;
      }
      public double getx1()
      {
      	return x1;
      }
      public double getx2()
      {
      	return x2;
      }
      public double gety1()
      {
      	return y1;
      }
       public double gety2()
      {
      	return y2;
      }
       public void setx1(Double x1)
       {
       	this.x1=x1;
       }
       public void setx2(Double x2)
       {
       	this.x2=x2;
       }
       public void sety1(Double y1)
       {
       	this.y1=y1;
       }
       public void sety2(Double y2)
       {
       	this.y2=y2;
       }
       Double distance(Point P1)
       {
       	double dis;
       	dis=Math.sqrt(Math.pow((getx2()-P1.getx1()),2)
       	+ Math.pow((gety2()-P1.gety1()),2));
       	return dis;
       }
}
