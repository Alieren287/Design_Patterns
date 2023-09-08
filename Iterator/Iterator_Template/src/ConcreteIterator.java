public class ConcreteIterator implements Iterator{
    ConcreteCollection collection;

    public ConcreteIterator(){}

    public ConcreteIterator(ConcreteCollection c) {
        collection = c;
    }

    @Override
    public void getNext() {
    }

    @Override
    public boolean hasMore() {
        return false;
    }
}
