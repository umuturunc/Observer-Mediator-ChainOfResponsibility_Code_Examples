package goodpractice;

import lombok.Getter;
import lombok.Setter;

public class PowerSupplier {
    @Getter
    @Setter
    private Mediator mediator;
    public boolean isOn=false;
    public void turnOn() {
        // implementation
        isOn=true;
    }
    public void turnOff() {
        // implementation
        isOn=false;
    }
}
