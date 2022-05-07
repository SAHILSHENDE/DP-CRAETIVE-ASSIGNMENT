package Receiver;

public class Stock {
    private String name = "Tata";
    private int quantity = 1000;

    public void buy() { System.out.println("Stock [ Name: "+name+ " , Quantity: " + quantity +" ]\tis bought."); }

    public void sell() { System.out.println("Stock [ Name: "+name+" , Quantity: " + quantity +" ]\tis sold."); }
}
