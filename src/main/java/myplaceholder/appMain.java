package myplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class appMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PlaceHolderConfig.class);

        Object names[] = {"Young"};
        TestBean tb = (TestBean)context.getBean("GetTestBeaning");
        System.out.println(tb.jdbcurl);
        System.out.println(tb.god);
        System.out.println(tb.os);
        System.out.println(tb.randString);
    }
}
