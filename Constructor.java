import java.util.*;
class Rectangle{
int len;
int b;
Rectangle(){
len=8;
b=10;
}
Rectangle(int x, int y){
len=x;
b=y;
}
int getarea(){
return(len*b);
}
}
class Main2{
public static void main(String args[]){
int ar,ar2;
Rectangle obj=new Rectangle();
Rectangle obj2=new Rectangle(90,10);
ar=obj.getarea();
ar2=obj2.getarea();
System.out.println("AREA OF RECTANGLE 1==>> "+ar);
System.out.println("AREA OF RECTANGLE 2==>> "+ar2);
}
}
