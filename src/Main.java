public class Main {

    public static void main(String[] args) {

        final AutoShop shop = new AutoShop();
        final int buyers = 10;

        for (int i = 1; i <= buyers; i++) {
            new Buyer("Покупатель " + i, shop).start();
        }
        new Manufacturer("Производитель Cadillac",shop).start();
    }
}