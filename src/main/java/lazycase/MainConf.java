package lazycase;

import org.springframework.context.annotation.*;

@Configuration
public class MainConf extends ParentConf{

    @Bean(name="young")
    String getStringBean() {
        return "Hello Young";
    }

    @Lazy
    @Bean(name="user")
    @Scope("prototype")
    User getUser(String y) {
        System.out.println("User created!");
        return new User(y, 32);
    }

    @Lazy
    @Bean(name="user2")
    @Scope("prototype")
    User getUser(String x, String y) {
        System.out.println("User with 2 parames created");
        return new User(x + "," + y, 44);
    }
}
