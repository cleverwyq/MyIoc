package tryinitabstract;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "tryinitabstract")
public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppMain.class);
        AbstractClass ac = context.getBean(AbstractClass.class);
        System.out.println(ac);
    }
}
