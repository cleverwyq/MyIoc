package testprimary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "testprimary")
public class SingerServiceConf {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SingerServiceConf.class);
        SingerService sg = context.getBean(SingerService.class);
        sg.Sing();
    }
}
