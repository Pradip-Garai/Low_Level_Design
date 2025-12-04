// Exception Rule

class Parent{
  
    public void getValue(){
        throw new RuntimeException("Runtion Exception from Parent Class");
    }
}

class Child extends Parent{
    @Override
    public void getValue(){
        throw new ArithmeticException("Arithmetic Exception from Child class");
    }
}

class Client{
    private Parent p;

    public Client(Parent p){
        this.p = p;
    }

    public void getCall(){
         try{
            p.getValue();
        }catch(RuntimeException err){
          System.out.println(err);
        }
    }
}


public class Signeture_ExceptionRules {
    public static void main(String as[]){
        Parent parent = new Parent();
        Parent child = new Child();

        Client c = new Client(parent);
        c.getCall();

        Client c2 = new Client(child);
        c2.getCall();
    }
}
