package im.jroadie.javaplayground;


abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("Abs");
        test();
    }

    public void test() {
        System.out.println("test from abstract");
    }
}

class ImplClass extends AbstractClass {
    ImplClass() {
        super();
    }

    public void test() {
        System.out.println("test from impl");
    }
}

public class AbstractHierarchy {

    public static void main(String[] args) {
        new ImplClass();
    }

}
