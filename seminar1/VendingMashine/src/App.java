import java.util.ArrayList;
import java.util.List;

import domen.*;
import service.*;

public class App {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Layce", 10, 13);
        Product product2 = new Product(2, "shocolat", 11, 15);
        Product product3 = new Product(3, "cnek", 12.34, 14);
        List<Product> prList = new ArrayList<>();
       prList.add(product1);
       prList.add(product2);
       prList.add(product3);
       Product bottle = new Bottle(4, "colla", 123, 6, 0.33);
       prList.add(bottle);
       Product hotDr = new HotDrink(6, "tee", 50, 7, 70);
       prList.add(hotDr);
       Product hotDr2 = new HotDrink(8, "coffee", 80, 10, 60);
       prList.add(hotDr2);
       Holder holder = new Holder();
       Display display = new Display();
       CoinDes coindes = new CoinDes();
       VendingMashine vendingMashine = new VendingMashine(coindes, display,holder, prList);
       for (Product item : vendingMashine.getProduct()) {
            System.out.println(item);
       }
    }
}
