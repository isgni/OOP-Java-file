import java.util.Scanner;
import javax.swing.*;
class Employee{
String name;
int sal;
int days, tsal;
public


 
void getinfo()
{
	 Scanner in=new  Scanner (System.in);
	
System.out.println("Name of the empoyee:");
name=in.nextLine();
System.out.println("Salary:");
sal=in.nextInt();
System.out.println("Number of days work:");
days=in.nextInt();


}
void computesal()
{
	tsal=sal*days;
	
	
	
}

	void printsal()
	{
		
		JOptionPane.showMessageDialog(null,"Total salary of " +name+ " is "+ tsal);
		
	}
	



}

public class Main{
public static void main(String [] args)
{
Employee emp = new Employee();


emp.getinfo();
emp.computesal();
emp.printsal();

}}


