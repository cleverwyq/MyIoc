package myproxy;

public class AppMain {
    public static void main(String[] args) {
        VehicalProxy proxy = new VehicalProxy(new Car());
        IVehical v = new Car();
        IVehical proxyObj = proxy.create();
        proxyObj.run("1 hour");
    }
}

