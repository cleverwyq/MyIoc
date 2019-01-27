package javaconfig;

import javaconfig.p3.TestBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AnotherConf {
    @Bean
    @Scope("prototype")
    public TestBean3 getBean3ByAnotherConf() {
        return new TestBean3();
    }
}
