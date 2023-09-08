public class ConcreteCollection implements IterableCollection{
    public Iterator createIterator() {
        return new ConcreteIterator();
    }
}
