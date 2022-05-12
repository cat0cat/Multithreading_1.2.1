public class Buyer extends Thread{

    private final AutoShop shop;

    public Buyer(String name, AutoShop shop) {
        super(name);
        this.shop = shop;
    }

    @Override
    public void run() {
        shop.buyCar();
    }
}
