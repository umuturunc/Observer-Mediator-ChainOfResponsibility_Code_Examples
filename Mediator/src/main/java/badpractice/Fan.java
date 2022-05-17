package badpractice;

import lombok.Getter;
import lombok.Setter;

public class Fan {

    @Getter
    @Setter
    private PowerSupplier powerSupplier;

    public boolean isOn = false;

    public void turnOn() {
        powerSupplier.turnOn();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        powerSupplier.turnOff();
    }

}
