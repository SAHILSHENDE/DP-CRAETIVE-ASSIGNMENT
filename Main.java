package Main;

import ConcreteCommand.BuyStock;
import ConcreteCommand.SellStock;
import Invoker.Broker;
import Receiver.Stock;

//Command Design Pattern Stock Market.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Command Design Pattern Stock Market.\n");
    	    	
        Stock tataStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(tataStock);
        SellStock sellStockOrder = new SellStock(tataStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
