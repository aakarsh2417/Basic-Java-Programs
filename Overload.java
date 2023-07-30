import java.util.*;
class Volume{
int vol(int a){
return(a*a*a);
}
int vol(int a,int b,int c){
return(a*b*c);
}
double vol(double r,int h){
return(3.14*r*r*h);
}
}
class Main3{
public static void main(String args[]){
int v1,v2,a1,a2,a3,a4,h;
double r,v3;
Volume obj=new Volume();
Scanner s = new Scanner(System.in);
System.out.println("Enter length of edge of cube");
a1=s.nextInt();
v1=obj.vol(a1);
System.out.println("Enter length,breadth and height of edge of cube");
a2=s.nextInt();
a3=s.nextInt();
a4=s.nextInt();
v2=obj.vol(a2,a3,a4);
System.out.println("Enter radius and height of cylinder");
r=s.nextFloat();
h=s.nextInt();
v3=obj.vol(r,h);
System.out.println("VOLUME OF CUBE==>> "+v1);
System.out.println("VOLUME OF CUBOID==>> "+v2);
System.out.println("VOLUME OF CYLINDER==>> "+v3);
}
}
