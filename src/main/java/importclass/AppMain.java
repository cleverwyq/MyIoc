package importclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ServiceConf.class);
        DemoService ds = ctx.getBean(DemoService.class);
        ds.doSomething();
    }
}
