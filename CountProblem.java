import java.util.*;
public class Solution {
static int oneToTen,elevenToTwenty,twentyToThirty,thirtyToFourty,fourtyToFifty,fiftyToSixty,
sixtyToSeventy,seventyToEighty,eightyToNinety,ninetyOneToHundred;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of people");
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			calculateCount(a[i]);
		}
		System.out.println("Age Group"+" "+"Total number of people");
		System.out.println("1-10"+"\t\t"+oneToTen);
		System.out.println("11-20"+"\t\t"+elevenToTwenty);
		System.out.println("21-30"+"\t\t"+twentyToThirty);
		System.out.println("31-40"+"\t\t"+thirtyToFourty);
		System.out.println("41-50"+"\t\t"+fourtyToFifty);
		System.out.println("51-60"+"\t\t"+fiftyToSixty);
		System.out.println("61-70"+"\t\t"+sixtyToSeventy);
		System.out.println("71-80"+"\t\t"+seventyToEighty);
		System.out.println("81-90"+"\t\t"+eightyToNinety);
		System.out.println("91-100"+"\t\t"+ninetyOneToHundred);
	}
	public static void calculateCount(int k)
	{
		if(k<=10)
		{
			oneToTen++;	
		}
		else if(k>10 && k<=20)
		{
			elevenToTwenty++;
		}
		else if(k>20 && k<=30)
		{
			twentyToThirty++;
		}
		else if(k>30 && k<=40)
		{
			thirtyToFourty++;
		}
		else if(k>40 && k<=50)
		{
			fourtyToFifty++;
		}
		else if(k>50 && k<=60)
		{
			fiftyToSixty++;
		}
		else if(k>60 && k<=70)
		{
			sixtyToSeventy++;
		}
		else if(k>70 && k<=80)
		{
			seventyToEighty++;
		}
		else if(k>80 && k<=90)
		{
			eightyToNinety++;
		}
		else if(k>90 && k<=100)
		{
			ninetyOneToHundred++;
		}
	}

}
