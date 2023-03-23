class Car
{
    private
    String model;

    public
    Car(String modelValue)

   {
        System.out.println("Object created.");
        model = modelValue;
        
        // Increment static member:
        carsCount++;
   }
   
    static int carsCount;
}

public class Main {
    public static void main(String[] args) {
    
        // Set value to static member:
        Car.carsCount = 0;
        System.out.println("Initial Cars Count: " +
                Car.carsCount);
        // create instances:
       Car carobj1 = new Car("Toyota Corolla");
        Car carobj2 = new Car("Peugeot 508");
        Car carobj3 = new Car("Renault Clio");

        System.out.println("Final Cars Count: " +
               Car.carsCount);

    }
}