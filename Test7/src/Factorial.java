import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner van=new Scanner(System.in);
		
		int num,i,j=1;
		System.out.println("Enter any No.:");
		num=van.nextInt();
		van.close();
		for(i=1;i<=num;i++)
		  {
			
			j=j*i;
		 }
		System.out.println(" "+j);
	}

}
/*Scanner van=new Scanner(System.in);

int num,i=1,j=1;
System.out.println("Enter any No.:");
num=van.nextInt();
van.close();
while(i<=num)
  {
	
	j=j*i;
	i++;
 }
System.out.println(" "+j);
}

}*/
