import java.security.InvalidParameterException;

class User{

    // password should be greater than 8
    protected void CreatePassword(String pass){
      if(pass.length()<8)
        throw new InvalidParameterException("Password Length should be greater than 8 ");
      System.out.println("Password Created Successfull!!!");
    }
}

class PremiumUser extends User{

    @Override
    // password should be greater than 8
    protected void CreatePassword(String pass){
      if(pass.length()<6)
        throw new InvalidParameterException("Password Length should be greater than 6 ");
      System.out.println("Password Created Successfull!!!");
    }
}

public class Method_PreCondition {
    public static void main(String as[]){
        User u1 = new User();
        u1.CreatePassword("Pradip123");

        PremiumUser u2 = new PremiumUser();
        u2.CreatePassword("Deep_Das");
    }
}
