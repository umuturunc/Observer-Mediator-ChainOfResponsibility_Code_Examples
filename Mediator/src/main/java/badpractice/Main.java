package badpractice;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        Fan fan = new Fan();

        button.setFan(fan);

        PowerSupplier powerSupplier = new PowerSupplier();
        fan.setPowerSupplier(powerSupplier);

        System.out.println("Initial states");
        System.out.println(String.format("Fan.isOn= %b    PowerSupplier.isOn=%b",fan.isOn,powerSupplier.isOn));

        button.press();
        System.out.println("Button pressed");
        System.     out.println(String.format("Fan.isOn= %b    PowerSupplier.isOn=%b",fan.isOn,powerSupplier.isOn));

    }
}
