import java.util.*;
class Rectangle{
int len;
int b;
void getdata(int x, int y){
len=x;
b=y;
}
int getarea(){
return(len*b);
}
}
class Main{
public static void main(String args[]){
int ar,l,b;
Rectangle obj=new Rectangle();
Rectangle obj2=new Rectangle();
Scanner s = new Scanner(System.in);
System.out.println("Enter length");
l=s.nextInt();
System.out.println("Enter breadth");
b=s.nextInt();
obj.getdata(l,b);
ar=obj.getarea();
obj2.len=10;
obj2.b=20;
int ar2=obj2.getarea();
System.out.println("LENGTH OF RECTANGLE 1==>> "+l);
System.out.println("BREADTH OF RECTANGLE 1==>> "+b);
System.out.println("AREA OF RECTANGLE 1==>> "+ar);
System.out.println("LENGTH OF RECTANGLE 2==>> "+obj2.len);
System.out.println("AREA OF RECTANGLE 2==>> "+obj2.b);
System.out.println("AREA OF RECTANGLE 2==>> "+ar2);
}
}
