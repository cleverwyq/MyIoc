package lazycase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class appMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        System.out.println("Factory ready");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }


}
