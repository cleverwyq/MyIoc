package springaop;

public class HelloWorldImpl2 implements  HelloWorld{
    @Override
    public void printHelloWorld() {
        System.out.println("Hello From Impl2");
    }

    @Override
    public void doPrint() {
        System.out.println("doPrint from Impl2");
    }
}
