class A extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Thread A: "+i);
}
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
System.out.println("Thread B: "+j);
}
}
}
class C extends Thread
{
public void run()
{
for(int k=1;k<=5;k++)
{
System.out.println("Thread C: "+k);
}
}
}
class ThreadPriority
{
public static void main(String args[])
47
{
A a=new A();
B b=new B();
C c=new C();
c.setPriority(Thread.MAX_PRIORITY);
a.setPriority(Thread.MIN_PRIORITY);
b.setPriority(a.getPriority()+1);
a.start();
b.start();
c.start();
}
}
