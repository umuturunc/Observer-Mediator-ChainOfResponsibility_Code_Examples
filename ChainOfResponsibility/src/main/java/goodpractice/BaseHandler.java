package goodpractice;

public abstract class BaseHandler implements Handler {
    private Handler nextHandler;
    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Object request) {
        //İsteği bir sonraki handler'a ilet
        if(nextHandler!=null)
            nextHandler.handle(request);
    }
}
