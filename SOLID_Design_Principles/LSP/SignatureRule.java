// Method Argument Rules:
class Parent{
    void printMsg(String msg){
        System.out.println(msg);
    }
}

class Child extends Parent{
    public void printMsg(String msg){
        System.out.println(msg);
    }
}

class Client{
    private Parent p;

    Client(Parent p){
        this.p = p;
    }

    public void MSG(){
        p.printMsg("Hello World");
    }
}

public class SignatureRule{
    public static void main(String as[]){

        // Parent parent = new Parent();
        Parent child = new Parent();

        Client c = new Client(child);
        c.MSG();
    }
}