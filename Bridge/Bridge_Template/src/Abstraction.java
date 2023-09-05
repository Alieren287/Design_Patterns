public abstract class Abstraction {
    Implementation i;

    public Abstraction(Implementation i) {
        this.i = i;
    }

    public void feature1() {
        i.method1();
    }
    public void feature2(){
        i.method2();
    }
}
