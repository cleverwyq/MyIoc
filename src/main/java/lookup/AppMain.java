package lookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConf.class);
        A a = context.getBean(A.class);
        B b0 = a.getB();
        b0.tell();
        B b1 = a.getB();
        B b2 = a.getB();
        System.out.println(b1 == b2);
    }
}
