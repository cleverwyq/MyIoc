package myplaceholder;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:placeholder.foo.properties")
@Configuration
public class PlaceHolderConfig {
    @Bean
    TestBean GetTestBeaning() {
//        System.out.println(name);
        return new TestBean();
    }
}
