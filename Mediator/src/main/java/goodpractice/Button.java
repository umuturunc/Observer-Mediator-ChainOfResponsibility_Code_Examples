package goodpractice;

import lombok.Getter;
import lombok.Setter;

public class Button {
    @Getter
    @Setter
    private Mediator mediator;

    public void press() {
        mediator.buttonPressed();
    }
}
