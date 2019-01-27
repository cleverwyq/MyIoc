package lazycase;

import org.springframework.context.annotation.*;

@Configuration
public class MainConf {

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
}
