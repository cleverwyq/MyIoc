package springaop;

public class HelloWorldImpl1 implements HelloWorld {
    @Override
    public void printHelloWorld() {
        System.out.println("Hello From Impl1");
    }

    @Override
    public void doPrint() {
        System.out.println("doPrint from Impl1");
    }
}
