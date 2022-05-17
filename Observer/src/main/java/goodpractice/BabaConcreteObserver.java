package goodpractice;

public class BabaConcreteObserver extends Observer {
    //Baba Related Code
    @Override
    public void update() {
        System.out.println("Öğrencinin kaçtığından babasının haberi oldu.");
    }
}
