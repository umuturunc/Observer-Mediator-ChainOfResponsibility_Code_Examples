package goodpractice;

import lombok.Getter;
import lombok.Setter;

public class Fan {
    @Getter
    @Setter
    private Mediator mediator;

    public boolean isOn = false;

    public void turnOn() {
        mediator.startPowerSupplier();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stopPowerSupplier();
    }

}
