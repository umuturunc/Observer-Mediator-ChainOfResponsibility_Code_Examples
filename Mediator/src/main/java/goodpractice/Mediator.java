package goodpractice;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    public void buttonPressed() {
        if (fan.isOn) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void startPowerSupplier() {
        powerSupplier.turnOn();
    }

    public void stopPowerSupplier() {
        powerSupplier.turnOff();
    }
}
