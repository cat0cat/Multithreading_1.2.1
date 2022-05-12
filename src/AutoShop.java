import java.util.ArrayList;
import java.util.List;

class AutoShop {
    private final static int PRODUCE_TIME = 2000;
    private final static int BUY_TIME = 1000;
    private final static int COUNT_CARS = 10;
    private final List<Cadillac> cadillacs = new ArrayList<>();

    public synchronized void buyCar() {
        try {
            System.out.println(Thread.currentThread().getName() + " зашел в автосалон");
            while (cadillacs.isEmpty()) {
                System.out.println("Машин нет");
                wait();
            }
            Thread.sleep(BUY_TIME);
            System.out.println(Thread.currentThread().getName() + " уехал на новеньком авто");
            cadillacs.remove(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void produceCadillac() {
        for (int i = 0; i < COUNT_CARS; i++) {
            try {
                Thread.sleep(PRODUCE_TIME);
                cadillacs.add(new Cadillac());
                System.out.println(Thread.currentThread().getName() + " выпустил новый Escalade");
                synchronized (this) {
                    notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


