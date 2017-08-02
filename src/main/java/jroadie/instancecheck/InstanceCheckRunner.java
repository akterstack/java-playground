package jroadie.instancecheck;

public class InstanceCheckRunner {

    public static void main(String[] args) {
        if(new Integer(456432231) == 456432231)
            System.out.println(777777777);
        test(new OneImplementation());
        test(new TwoImplementation());
    }

    public static void test(EmptyInterface emptyInterface) {
        if(emptyInterface instanceof OneImplementation) {
            System.out.println(((OneImplementation)emptyInterface).getLength());
        } else if(emptyInterface instanceof TwoImplementation) {
            System.out.println(((TwoImplementation)emptyInterface).getWidth());
        }
    }

}
