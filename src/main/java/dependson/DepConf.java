package dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
public class DepConf {
    @Bean(initMethod="init")
    @DependsOn({"second"})
    public First getFirst() {
        return new First();
    }

    @Bean(name="second", initMethod = "init")
    public Second getSecond() {
        return new Second();
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(DepConf.class);
        First first = ctx.getBean("getFirst", First.class);
        first.tell();
    }
}
