/******************************************************************************
12345
12345
12345
12345
12345

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner s = new Scanner(System.in);
		
		int i = 1;
		int n = s.nextInt();
		
		while(i<=n)
		{
		    int j = 1;
		    
		    while(j<=n)
		    {
		        System.out.print(j);
		        j+=1;
		    }
		    System.out.println();
		    i+=1;
		}
	}
}

