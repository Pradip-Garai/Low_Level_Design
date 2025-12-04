

interface TwoDShape {
   public void area();
}

interface ThreeDShape extends TwoDShape {
   public void volume();
}

class Circle implements TwoDShape{
    private double radius;

    public Circle(double radius){
       this.radius = radius;
    }
    
    @Override
    public void area(){
       double ar = 3.14 * radius * radius;
       System.out.println("Area of Circle is : " + String.format("%.2f", ar));
    }
}

class Square implements TwoDShape{
    private double side;

    public Square(double side){
       this.side = side;
    }

    @Override
    public void area(){
       double ar = side*side;
       System.out.println("Area of Square is : " + String.format("%.2f", ar));
    }
}

class Cube implements ThreeDShape{
    private double side;

    public Cube(double side){
        this.side = side;
    }

    @Override
    public void area(){
       double ar = 6 * Math.pow(side, 2);
       System.out.println("Area of Cube is : "+ String.format("%.2f", ar));
    }

    @Override
    public void volume(){
       double vol = Math.pow(side, 3);
       System.out.println("Volume of Cube is : "+ String.format("%.2f", vol));
    }
}

public class ISPFollowed {
    public static void main(String as[]){
        Circle c = new Circle(12);
        c.area();

        Square s = new Square(10);
        s.area();

        Cube cb = new Cube(14.23);
        cb.area();
        cb.volume();
    }
}
