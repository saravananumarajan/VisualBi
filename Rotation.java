import java.util.*;

public class Rotation {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of elements in array");
int number_of_elements=s.nextInt();
int[] a=new int[number_of_elements];
for(int i=0;i<number_of_elements;i++)
{
a[i]=s.nextInt();	
}
System.out.println("Enter the number of rotation");
int number_of_rotation=s.nextInt();

int[] result=rotateArray(number_of_rotation,a);
for(int i=0;i<result.length;i++)
{
System.out.print(result[i]+" ");	
}
	}
	public static int[] rotateArray(int n,int array[])
	{
		for(int i = 0; i < n; i++){    
            int j, last;    
               
            last = array[array.length-1];    
            
            for(j = array.length-1; j > 0; j--){    
               
                array[j] = array[j-1];    
            }    
               
            array[0] = last;    
            
        }    
        return array;
	}

}
