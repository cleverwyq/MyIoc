package lazycase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

@Configuration
public class MainConf {

    @Bean(name="young")
    String getStringBean() {
        return "Hello Young";
    }

    @Lazy
    @Bean(name="user")
    User getUser(String y) {
        System.out.println("User created!");
        return new User(y, 32);
    }
}
