package badpractice;

import lombok.Getter;
import lombok.Setter;


public class Button {
    @Getter
    @Setter
    private Fan fan;

    public void press() {
        if(fan.isOn)
            fan.turnOff();
        else
            fan.turnOn();
    }
}
