import java.util.Scanner;
class CarData{


String Cmodel, Cname, Cowner;
int Cprice;

public
Scanner in=new  Scanner (System.in);
void getthevalues()


{
	System.out.println("Car owner:");
Cowner=in.nextLine();

System.out.println("Bike model:");
Cmodel=in.nextLine();
System.out.println("Car Name:");
Cname=in.nextLine();
System.out.println("Car price:");
Cprice=in.nextInt();

}

void display()
{
	System.out.println("");
System.out.println("_________________________");
System.out.println("Car model: " + Cmodel);
System.out.println("Car name: " + Cname);
System.out.println("Car price: " + Cprice);
System.out.println("Car owner: " + Cowner);
System.out.println("_________________________");
}


}

public class Main{
public static void main(String [] args)
{
CarData com = new CarData();

com.getthevalues();
com.display();
}}


