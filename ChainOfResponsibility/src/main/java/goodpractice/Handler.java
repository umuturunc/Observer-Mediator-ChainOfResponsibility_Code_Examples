package goodpractice;

public interface Handler {
    //İsteği işle
    void handle(Object request);

    //Zincirin bir sonraki halkasını(sıradaki handler referansını) aklında tut
    void setNext(Handler nextHandler);
}
