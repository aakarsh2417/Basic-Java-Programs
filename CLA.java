//Using command line arguments
class Features
{
public static void main(String args[])
{
int count,i=0;
String s;
count=args.length;
System.out.println("No. of arguements are "+count);
while(i<count)
{
s=args[i];
i++;
System.out.println("Java is " +s);
}
}
}
