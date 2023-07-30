import java.util.*;
// multiplying 2 matrices 
class Mul_matrice
{
public static void main(String args[])
{
int a[][]= new int[3][3];
int b[][]= new int[3][3];
int mul[][]= new int[3][3];
int i,j,k;
Scanner s=new Scanner(System.in);
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println("Enter element for matrix A");
a[i][j]=s.nextInt();
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println("Enter element for matrix B");
b[i][j]=s.nextInt();
}
}
System.out.println("\n======================");
System.out.println("Matrix A==>>");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.print("\n");
}
System.out.println("\n======================");
System.out.println("Matrix B==>>");
for(i=0;i<3;i++)
11
{
for(j=0;j<3;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.print("\n");
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
mul[i][j]=0;
for(k=0;k<3;k++)
{
mul[i][j]+=a[i][k]*b[k][j];
}
}
}
System.out.println("\n======================");
System.out.println("Multiplied Matrix is==>>");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(mul[i][j]+"\t");
}
System.out.print("\n");
}
}
}
