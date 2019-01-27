package springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springioc.bean.Zoo;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Zoo zoo = ctx.getBean("Zoo", Zoo.class);
        System.out.println(zoo);
    }
}
