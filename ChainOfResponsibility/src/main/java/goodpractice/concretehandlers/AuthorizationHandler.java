package goodpractice.concretehandlers;

import goodpractice.BaseHandler;

public class AuthorizationHandler extends BaseHandler {
    @Override
    public void handle(Object request) {
        //Related core here
        System.out.println("Authorization completed");
        //İsteği bir sonraki handler'e ilet
        super.handle(request);
    }

}
