class Box
{
int l,b;
Box(int x,int y)
{
l=x;
b=y;
}
int area()
{
return(l*b);
}
}
class Box1 extends Box
{
int h;
Box1(int a,int b,int c)
{
super(a,b);
h=c;
}
int vol()
{
return(l*b*h);
}
}
class Price extends Box1
{
int r;
Price(int j,int k,int l,int m)
{
super(j,k,l);
r=m;
}
int cost()
{
return(l*b*h*r);
}
}
28
class TotalCost
{
public static void main(String args[])
{
Price p=new Price(8,9,10,11);
int a1=p.area();
int v1=p.vol();
int r1=p.cost();
System.out.println("Area: "+a1);
System.out.println("Volume of the box is: "+v1);
System.out.println("Total Cost of filling the box with water at Rs. "+11+"/Litre: "+r1);
}
}
