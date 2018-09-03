import java.util.Scanner;
public class FindingLargestNo {

	public static void main(String[] args) {
		int num,num1,num2;
		Scanner van=new Scanner(System.in);
		System.out.println("Enter 1st No.");
		num=van.nextInt();
		System.out.println("Enter 2nd No.");
        num1=van.nextInt();
        System.out.println("Enter 3rd No."); 
        num2=van.nextInt();
        if(num>=num1&&num>=num2)
        	System.out.println(+num+" IS LARGEST");
        else if(num1>=num&&num1>=num2)
        	System.out.println(+num1+" IS LARGEST");
        else
        	System.out.println(+num2+" IS LARGEST");
        	
	}

}
