public class Manufacturer extends Thread{

    private final AutoShop shop;

    public Manufacturer(String name, AutoShop shop) {
        super(name);
        this.shop = shop;
    }

    @Override
    public void run() {
        shop.produceCadillac();
    }
}
