class Car
{
   private
    // data inaccessible outside the class body:
    String model;
    int manifactureYear;

    public  
    String getModel()
    {
        return this.model;
    }

 
    int getManifactureYear()
    {
        return this.manifactureYear;
    }

    void setModel(String modelValue)
    {
        this.model = modelValue;
    }
    
   void setManifactureYear(int manifactureYearValue)
    {
        this.manifactureYear = manifactureYearValue;
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        
        car.setModel("Toyota Corolla");
        car.setManifactureYear(2020);

        // System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.getManifactureYear());
        System.out.println("Model: " + car.getModel());
    }
}