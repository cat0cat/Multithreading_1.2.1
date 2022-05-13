public class Main {

    public static final int BUYERS = 10;

    public static void main(String[] args) {

        final AutoShop shop = new AutoShop();

        for (int i = 1; i <= BUYERS; i++) {
            new Buyer("Покупатель " + i, shop).start();
        }
        new Manufacturer("Производитель Cadillac",shop).start();
    }
}