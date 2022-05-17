package goodpractice.concretehandlers;

import goodpractice.BaseHandler;

public class ValidationHandler extends BaseHandler {
    @Override
    public void handle(Object request) {
        //Related core here
        System.out.println("Validation completed");
        //İsteği bir sonraki handler'e ilet
        super.handle(request);
    }

}
