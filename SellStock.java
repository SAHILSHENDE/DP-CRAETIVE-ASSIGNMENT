package ConcreteCommand;

import Command.Order;
import Receiver.Stock;

public class SellStock implements Order {
    private Stock myStock;

    public SellStock(Stock someStock) { this.myStock = someStock; }

    public void execute() { myStock.sell(); }
}
