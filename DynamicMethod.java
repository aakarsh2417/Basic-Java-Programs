class A
{
 void callme()
 {
 System.out.println("Call me inside class");
 }
}
class B extends A
{
 void callme()
 {
 System.out.println("Call me method inside class");
 }
}
class C extends A
{
 void callme()
 {
 System.out.println("Call me inside class C");
 }
}
37
class Dispatch
{
 public static void main(String args[])
 {
 A a = new A();
 B b = new B();
 C c = new C();
 A r;
 r = a;
 r.callme();
 r = b;
 r.callme();
 r = c;
 r.callme();
 }
}
