package lazycase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class appMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        System.out.println("Factory ready");
        User user = context.getBean("user", User.class);
        User user2 = (User)context.getBean("user", new Object[]{"emily"});
        System.out.println(user);
        System.out.println(user2);
    }
}
