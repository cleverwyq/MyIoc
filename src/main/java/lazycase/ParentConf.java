package lazycase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class ParentConf {
    @Lazy
    @Bean(name="user")
    @Scope("prototype")
    User getUser(String y) {
        System.out.println("Parent User created!");
        return new User("default", 100);
    }
}
