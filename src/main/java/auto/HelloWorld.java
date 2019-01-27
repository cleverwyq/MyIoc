package auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("auto.xml");
        UserService us = ctx.getBean("UserService2", UserService.class);
        us.login();
    }
}
