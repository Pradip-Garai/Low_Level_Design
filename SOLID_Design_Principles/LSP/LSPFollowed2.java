abstract class NonGearableCar{
    abstract public void start();
    abstract public void stop();
}

abstract class GearableCar extends NonGearableCar {
    abstract public void changeGear();
}

class BMW extends GearableCar{

    @Override
    public void start(){
       System.out.println("BMW Start....");
    }
    public void changeGear(){
      System.out.println("Chnage Gear in BMW");
    }
    public void stop(){
      System.out.println("BMW Stop.");
    }
}

class Marcidies extends GearableCar {
    @Override
    public void start(){
       System.out.println("Marcidies Start....");
    }
    public void changeGear(){
      System.out.println("Chnage Gear in Marcidies");
    }
    public void stop(){
      System.out.println("Marcidies Stop.");
    }
}

class ElectricCar extends NonGearableCar{
    @Override
    public void start(){
       System.out.println("Electric Car Start....");
    }
    public void stop(){
       System.out.println("Electric Car Stop.");
    }
}

public class LSPFollowed2 {
    public static void main(String as[]){

        BMW bmw = new BMW();
        bmw.start();
        bmw.changeGear();
        bmw.stop();

        Marcidies marcidies = new Marcidies();
        marcidies.start();
        marcidies.changeGear();
        marcidies.stop();

        ElectricCar eCar = new ElectricCar();
        eCar.start();
        eCar.stop();
    }
}
