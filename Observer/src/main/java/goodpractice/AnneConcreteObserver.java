package goodpractice;

public class AnneConcreteObserver extends Observer {
    //Anne Related Code
    @Override
    public void update() {
        System.out.println("Öğrencinin kaçtığından annesinin haberi oldu.");
    }
}
