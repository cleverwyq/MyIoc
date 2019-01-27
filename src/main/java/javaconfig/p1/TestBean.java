package javaconfig.p1;

public class TestBean {

    public static void main(String[] args) {

    }
    private String name;

    public void sayHello() {
        System.out.println("Hello from bean");
    }

    public void init() {
        this.name = "Young";
        System.out.println("its name is :" + this.name);
        System.out.println("TestBean.init");

    }

    public void clean() {
        System.out.println("bean clean");
    }
}
