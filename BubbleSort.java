import java.util.*;
// sorting array
class Sorting
{
public static void main(String args[])
{
int arr[]=new int[10];
int i,j,n=10,temp;
for(i=0;i<n;i++)
{
System.out.println("Enter Value");
Scanner s= new Scanner(System.in);
arr[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if (arr[j]>arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
System.out.println("Sorted Array is==>");
for(i=0;i<n;i++)
{
System.out.print(arr[i]+"\t");
}
}
}
