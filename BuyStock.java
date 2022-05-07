package ConcreteCommand;

import Command.Order;
import Receiver.Stock;

public class BuyStock implements Order {
    private Stock myStock;

    public BuyStock(Stock someStock) { myStock = someStock; }

    public void execute() { myStock.buy(); }
}
