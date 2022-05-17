package goodpractice.concretehandlers;

import goodpractice.BaseHandler;

public class CachingHandler extends BaseHandler {
    @Override
    public void handle(Object request) {
        //Related core here
        System.out.println("Caching completed");
        //İsteği bir sonraki handler'e ilet
        super.handle(request);
    }
}
