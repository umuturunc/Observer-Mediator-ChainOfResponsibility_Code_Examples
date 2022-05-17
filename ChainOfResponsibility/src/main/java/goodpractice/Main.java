package goodpractice;

import goodpractice.concretehandlers.AuthenticationHandler;
import goodpractice.concretehandlers.AuthorizationHandler;
import goodpractice.concretehandlers.CachingHandler;
import goodpractice.concretehandlers.ValidationHandler;

public class Main {
    public static void main(String[] args) {
        //Handler nesnelerini oluştur
        Handler authenticationHandler = new AuthenticationHandler();
        Handler authorizationHandler = new AuthorizationHandler();
        Handler validationHandler = new ValidationHandler();
        Handler cachingHandler = new CachingHandler();

        //Zinciri oluştur
        authenticationHandler.setNext(authorizationHandler);
        authorizationHandler.setNext(validationHandler);
        validationHandler.setNext(cachingHandler);

        authenticationHandler.handle(new Object());
    }
}
