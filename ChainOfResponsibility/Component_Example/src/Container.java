public class Container extends Component {
    Component children;

    public void add(Component child) {
        children = child;
    }
}
