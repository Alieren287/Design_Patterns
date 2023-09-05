public abstract class BaseHandler implements Handler {
    Handler next;

    @Override
    public void setNext(Handler nextHandler) {
        next = nextHandler;
    }
    @Override
    public abstract void handle(String request);
}
