package annoaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConf.class);
        MyService service = context.getBean(MyService.class);
        service.doSomething();
    }
}
