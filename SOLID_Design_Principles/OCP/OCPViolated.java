package SOLID_Design_Principles.OCP;

import java.util.ArrayList;
import java.util.List;

class Product{
    public String name;
    public double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart{
    public List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getProducts(){
        return products;
    }

    // calculate Product price 
    public double calcTotalPrice(){
        double total = 0;
        for(Product p: products){
            total+=p.price;
        }
        return total;
    }
}

class CartInvoicePrint{
    private ShoppingCart cart;

    public CartInvoicePrint(ShoppingCart cart) {
        this.cart = cart;
    }

    public void printInvoice() {
    System.out.println("=====================================");
    System.out.println("           Shopping Invoice          ");
    System.out.println("=====================================");
    System.out.printf("%-25s %10s\n", "Product Name", "Price (Rs)");
    System.out.println("-------------------------------------");

    for (Product p : cart.getProducts()) {
        System.out.printf("%-25s %10.2f\n", p.name, p.price);
    }

    System.out.println("-------------------------------------");
    System.out.printf("%-25s %10.2f\n", "TOTAL", cart.calcTotalPrice());
    }

}

// Violated OCP
class MakePayment{
    private ShoppingCart cart;
    private double totalPrice;

    public MakePayment(ShoppingCart cart){
       this.cart = cart;
       this.totalPrice = cart.calcTotalPrice();
    }

    public void CardPayment(){
        System.out.println("Rs. "+totalPrice+" payment successfully done using Card");
    }
    public void UPIPayment(){
        System.out.println("Rs. "+totalPrice+" payment successfully done using UPI");
    }
    public void MobailWaletPayment(){
        System.out.println(cart);
        System.out.println("Rs. "+totalPrice+" payment successfully done using Mobail Walet");
    }
}


public class OCPViolated {
    public static void main(String as[]){
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Iphone 16 Pro Max", 120000));
        cart.addProduct(new Product("Iphone Charger", 2999));
        cart.addProduct(new Product("Neon Back cover", 1239));

        CartInvoicePrint print = new CartInvoicePrint(cart);
        print.printInvoice();

        MakePayment pay = new MakePayment(cart);
        
        // payment using Card
        pay.CardPayment();

        // UPI Paymant
        pay.UPIPayment();

    }
}
