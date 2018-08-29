import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		int i,j=0;
		Scanner van=new Scanner(System.in);
		System.out.println("Enter any No.:");
		int num1=van.nextInt();
		for(i=1;i<=num1;i++)
		{
			j=j+i;
		}
    System.out.println("RESULT:"+j);
	}

}
