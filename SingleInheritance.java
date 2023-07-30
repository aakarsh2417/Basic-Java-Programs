class Area
{
int l,b;
Area(int x,int y)
{
l=x;
b=y;
}
int area()
{
return(l*b);
}
}
class Cost extends Area
{
int rate;
Cost(int a,int b,int c)
{
super(a,b);
rate=c;
}
int totalcost()
{
return(l*b*rate);
}
}
class SingleInheritance
{
public static void main(String args[])
{
Cost c=new Cost(8,9,6);
int ar=c.area();
int tc=c.totalcost();
System.out.println("The area of Floor is: "+ar);
System.out.println("The total cost of titling the floor is: "+tc);
}
}
