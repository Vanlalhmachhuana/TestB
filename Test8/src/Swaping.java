import java.util.Scanner;
public class Swaping {

	public static void main(String[] args) {
		int num,num1,no;
		Scanner van=new Scanner(System.in);
		System.out.println("Enter 1st No.");
		num=van.nextInt();
        System.out.println("Enter 2nd No.");
        num1=van.nextInt();
        System.out.println("Before SWAPPING:-\nnum:"+num+" num1:"+num1);
        System.out.println("Enter METHOD:(1.SWAPPING USING 3rd No.\n2.SWAPPING WITHOUT 3rd");
        no=van.nextInt();
        switch(no)
        {
        case 1:
        	int temp;
        	temp=num;
        	num=num1;
        	num1=temp;
        	System.out.println("AFTER SWAPPING:-\nnum:"+num+" num1:"+num1);
        	break;
        case 2:
        
        num=num+num1;
        num1=num-num1;
        num=num-num1;
        System.out.println("After SWAPPING:-\nnum:"+num+" num1:"+num1);
       break;
        
        default:
        System.out.println("WRONG:");
        
	}


}}