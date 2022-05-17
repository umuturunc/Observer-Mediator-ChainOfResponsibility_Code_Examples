package goodpractice;

public class OgretmenConcreteObserver extends Observer {
    //Ogretmen Related Code
    @Override
    public void update() {
        System.out.println("Öğrencinin kaçtığından öğretmenin haberi oldu.");
    }
}
