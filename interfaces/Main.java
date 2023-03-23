interface Vehicle
{
    // Function that must be defined in
    // each class that extends the interface
    double getInsuranceCost(int months);
}
class Car implements Vehicle
{
    // Implementation of interface.
    public double getInsuranceCost(int months)
    {
        return 25 * months;
    }
}

class Bicycle implements Vehicle
{
    // Implementation of interface.
    public double getInsuranceCost(int months)

    {
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println( "Car's Year Insurance: " + car.getInsuranceCost(12) + " $");
        Bicycle bicycle = new Bicycle();
        System.out.println( "Bike's Year Insurance: " + bicycle.getInsuranceCost(12) + " $");
    }
}