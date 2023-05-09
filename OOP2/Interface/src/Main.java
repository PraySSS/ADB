import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       CarInterface carInterface=new ElectricCar("Tesla");
       carInterface.start();
       carInterface.move(120);

       CarInterface gasCarInterface=new GasCar("Mercedes");
       gasCarInterface.start();
       gasCarInterface.move(220);
    }
}