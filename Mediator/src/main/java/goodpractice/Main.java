package goodpractice;

public class Main {
    public static void main(String[] args) {
        //Button, Fan ve PowerSupplier nesnelerini oluştur
        Button button = new Button();
        Fan fan = new Fan();
        PowerSupplier powerSupplier = new PowerSupplier();

        //Arabulucuya bu sınıfların referanslarını gönder
        Mediator mediator = new Mediator(button,fan,powerSupplier);

        //Nesneler, iletişimi sağlamak için arabulucunun referansını tutuyorlar.
        button.setMediator(mediator);
        fan.setMediator(mediator);
        powerSupplier.setMediator(mediator);

        System.out.println("Initial states");
        System.out.println(String.format("Fan.isOn= %b    PowerSupplier.isOn=%b",fan.isOn,powerSupplier.isOn));

        button.press();
        System.out.println("Button pressed");
        System.out.println(String.format("Fan.isOn= %b    PowerSupplier.isOn=%b",fan.isOn,powerSupplier.isOn));

    }
}
