package javaconfig.p2;

import org.springframework.stereotype.Component;

@Component
public class TestBean2 {
    private String name;

    public void sayHello() {
        System.out.println("Hello from bean2");
    }

    public void init() {
        this.name = "Young2";
        System.out.println("its name is :" + this.name);
    }

    public void clean() {
        System.out.println("bean2 clean");
    }
}

