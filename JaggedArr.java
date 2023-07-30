import java.util.*;
//implementing jagged arrays
class Jagged
{
public static void main(String args[])
{
int i,r,c;
int count=0;
Scanner s= new Scanner(System.in);
System.out.println("Enter no. of rows for jagged array");
r=s.nextInt();
int a[][]=new int[r][];
for(i=0;i<r;i++)
{
System.out.println("Enter column size for row "+(i+1));
c=s.nextInt();
a[i]= new int[c];
}
for(i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
System.out.println("Enter element for row "+(i+1));
a[i][j]=s.nextInt();
16
}
}
System.out.println("\nJAGGED ARRAY IS ==>>");
for(i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.print("\n");
}
}
}
