package goodpractice.concretehandlers;

import goodpractice.BaseHandler;

public class AuthenticationHandler extends BaseHandler {
    @Override
    public void handle(Object request) {
        //Related core here
        System.out.println("Authentication completed");
        /* Kendi görevini yaptı */

        //İsteği bir sonraki handler'e ilet
        super.handle(request);
    }

}
