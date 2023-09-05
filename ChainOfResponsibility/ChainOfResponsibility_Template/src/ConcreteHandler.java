public class ConcreteHandler extends BaseHandler {

    @Override
    public void handle(String request) {
        if(canHandleRequest(request))
            next.handle(request);
    }

    private boolean canHandleRequest(String request) {
        return ConcreteHandler.class.getName().equals(request);
    }
}
