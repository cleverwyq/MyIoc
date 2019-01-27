package springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springaop_hello.xml");

        HelloWorld hw1 = ctx.getBean("helloWorldImpl1", HelloWorld.class);
        hw1.printHelloWorld();
        hw1.doPrint();
    }
}
