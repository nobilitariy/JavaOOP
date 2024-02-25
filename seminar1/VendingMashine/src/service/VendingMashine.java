package service;

import java.util.List;
import domen.Product;


/**
 * VendingMashine
 */
public class VendingMashine {
    private CoinDes coinDes;
    private Display display;
    private Holder holder;
    private List<Product> product;
    public VendingMashine(CoinDes coinDes, Display display, Holder holder, List<Product> product) {
        this.coinDes = coinDes;
        this.display = display;
        this.holder = holder;
        this.product = product;
    }
    public CoinDes getCoinDes() {
        return coinDes;
    }
    public void setCoinDes(CoinDes coinDes) {
        this.coinDes = coinDes;
    }
    public Display getDisplay() {
        return display;
    }
    public void setDisplay(Display display) {
        this.display = display;
    }
    public Holder getHolder() {
        return holder;
    }
    public void setHolder(Holder holder) {
        this.holder = holder;
    }
    public List<Product> getProduct() {
        return product;
    }
    public void setProduct(List<Product> product) {
        this.product = product;
    }
    public void addProduct(Product product){
        if(product.getPrice()<= 0){
            product.setPrice(100);
        }
        this.product.add(product);
    }
}