package cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("cg.xml");
        UserDao ud = ctx.getBean(UserDao.class);
        System.out.println(ud.add(3));
    }
}
