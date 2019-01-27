package hello;

import org.joda.time.LocalTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        UserDao ud = ctx.getBean("UserDao", UserDao.class);
        System.out.println(ud.Save());
        System.out.println(ud.getName());

        Wrapper w = ctx.getBean("Wrapper", Wrapper.class);
        w.tell();
        System.out.println("show ud:" + ud.getName());

        Wrapper w2 = ctx.getBean("Wrapper2", Wrapper.class);
        w2.tell();

    }
}
