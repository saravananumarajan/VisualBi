import java.util.*;
public class HardProblem
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int islands=0;
int value0=0,value1=1;
int row=s.nextInt();
int count=0;
int column=s.nextInt();
int[][] a=new int[row][column];
Visit visit=new Visit();
for(int i=0;i<row;i++)
{
for(int j=0;j<column;j++)
{
	a[i][j]=s.nextInt();
}

}
for(int i=0;i<row;i++)
{
for(int j=0;j<column;j++)
{
	if(j==0)
	{
	if(a[i][j]==value1)
	{
	
	visit.value=value1;
	visit.jvalue=j;
	}
	}
	else
	{
		if((visit.jvalue==j-1) && (a[i][j]==value1) && visit.value==value1)
		{
			
			if(count==0)
			{
			islands++;
			}
			}
		else if((visit.jvalue!=j-1) && (a[i][j]==value1) && visit.value==value1)
		{
			count=0;
		}
	}
}
}
System.out.println(islands);
}
}
class Visit
{
public int value=0;	
public int jvalue=0;
}