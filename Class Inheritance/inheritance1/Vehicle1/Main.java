class Vehicle
{
    public
    double getInsuranceCost(int months)
    {
        return 0;
    }
};

//Scooter inherits Vehicle.
class Scooter extends Vehicle
{
    public
    //overwriting method
    double getInsuranceCost(int months)
    {
        return months * 15;
    }
}
//Car inherits Vehicle.
class Car extends Vehicle
{
    public
    //overwriting method
    double getInsuranceCost(int months)
    {
        return months * 25;
    }
}

//Bicycle inherits Vehicle.
class Bicycle extends Vehicle
{
    //the class  uses getInsurancost()
    //inherited from Vehicle

}

public class Main{
    public static void main(String[] args){

Scooter scooter  = new Scooter ();
System.out.println("Scooter year insurance: " + scooter.getInsuranceCost(12) + "$" );


Car car = new Car();
System.out.println("Car Year Insurance: " + car.getInsuranceCost(12) + " $");

Bicycle bike = new Bicycle();
System.out.println("Bicycle Year Insurance: " + car.getInsuranceCost(12) + " $");

    } 
}