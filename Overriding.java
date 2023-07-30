import java.util.*;
class Over
{
void get(){
System.out.println("Super class");
}
}
class Over1 extends Over
{
void get(){
System.out.println("Sub class");
System.out.println("Overriding");
}
}
class FunctionOverriding{
public static void main(String args[]){
Over1 a=new Over1();
a.get();
}
}
