class Car{
    protected int speed = 0;

    protected void Accelate(int speed){

        this.speed+= speed;
        System.out.println("Speed Increased...");
        System.out.println("Current Speed : "+this.speed);
    }
    
    protected void Break(){
       speed-=20;
       System.out.println("Speed Decreased...");
       System.out.println("Current Speed : "+speed);
    }
}

class ElectricCar extends Car{
    private int battery = 50;

    @Override
    protected void Accelate(int speed){
        this.speed+= speed;
        System.out.println("Speed Increased...");
        System.out.println("Current Charging : "+battery);
    }
    
    @Override
    protected void Break(){
       speed-=20;
       battery+=10;
       System.out.println("Speed Decreased...");
       System.out.println("Current Charging : "+battery);
    }
}

public class Method_PostCondition {
    public static void main(String as[]){

        System.out.println("Normal Car\n==========");
        Car car = new Car();
        car.Accelate(100);
        car.Break();

        System.out.println("\nElectric Car\n==========");
        ElectricCar eCar = new ElectricCar();
        eCar.Accelate(100);
        eCar.Break();
    }
}
