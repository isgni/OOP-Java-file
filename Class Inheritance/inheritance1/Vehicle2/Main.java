class Vehicle
{
    protected
    String brand;
    String model;

    public
    Vehicle(String brandValue, String modelValue)

    {
        this.brand = brandValue;
        this.model = modelValue;
        System.out.println("Vehicle constructor");
    }
    void representation()

    {
        System.out.println("Brand: " + this.brand);

    }
}

class Car extends Vehicle

{
private
    int horsePowers;
public
    Car(String brandValue, String modelValue, int horsePowersValue)

    {
       super(brandValue, modelValue);
        System.out.println("Car constructor");
        horsePowers = horsePowersValue;
    }
    void representation()
    {

        super.representation();
        System.out.println("Model: " + model);
        System.out.println("Horse Powers: " + horsePowers);
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle sampleBicycle = new Vehicle("Merida ", "ONE-FORTY 800");
        sampleBicycle.representation();
       System.out.println("--------------------");
 
        Car fordCar = new Car("Ford", "Fiesta", 80);
        fordCar.representation();
        System.out.println("--------------------");
 
        Car toyotaCar = new Car("Toyota", "Corolla", 100);
        toyotaCar.representation();
    }
}