package lazycase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class appMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        System.out.println("Factory ready");

        System.out.println("below one is no param");
        User user_no_param = context.getBean("user", User.class);
        System.out.println(user_no_param);

        System.out.println("");
        System.out.println("below one is 1 param");
        User user_one_param = (User)context.getBean("user", new Object[]{"emily"});
        System.out.println(user_one_param);

        System.out.println("");
        System.out.println("below one is 2 param");
        User user_two_param = (User)context.getBean("user", new Object[]{"emily", "yili"});
        System.out.println(user_two_param);
    }
}
