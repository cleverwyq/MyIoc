package javaconfig;

import javaconfig.p1.TestBean;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="javaconfig.p2")
@ImportResource(locations = {"classpath:bean3.xml","classpath:bean3_1.xml"})
@Import(value = {AnotherConf.class, javaconfig.phelloservice.HelloServiceConf.class})
public class TestConf {
    public TestConf() {
        System.out.println("TestConf is started");
    }


    @Bean(initMethod = "init", destroyMethod = "clean")
    @Scope("prototype")
    public TestBean getTestBean() {
        return new TestBean();
    }

}
