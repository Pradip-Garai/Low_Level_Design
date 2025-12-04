// Return Type Rule

class Animal{
    // this is Parent or Broad class 
}

class Dog extends Animal{
    // This is child or Narrow class
}

class Parent{
    
    public Animal getAnimal(){
        System.out.println("Parent class Return Animal class");
        return new Animal();
    }
}

class Child extends Parent{
    public Dog getAnimal(){
        System.out.println("Child Class Return Dog Class");
        return new Dog();
    }
}

class Client{
    private Parent p;

    public Client(Parent p){
        this.p = p;
    }

    public void takeAnimal(){
        p.getAnimal();
    }
}

public class Signature_ReturnType {
   public static void main(String as[]){

    Parent parent = new Parent();
    Parent child = new Child();

    Client c = new Client(parent);
    c.takeAnimal();

    Client c2 = new Client(child);
    c2.takeAnimal();

   } 
}
