import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class even2
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a+1;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(+i +" ");
			}
		}
	}
}
