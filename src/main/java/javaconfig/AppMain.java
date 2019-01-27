package javaconfig;

import javaconfig.p1.TestBean;
import javaconfig.p2.TestBean2;
import javaconfig.p3.TestBean3;
import javaconfig.phelloservice.HelloServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TestConf.class);
        TestBean tb = ctx.getBean("getTestBean", TestBean.class);
        tb.sayHello();
        System.out.println(tb);

        TestBean tb2 = ctx.getBean("getTestBean", TestBean.class);
        System.out.println(tb2);


        TestBean2 t2b = ctx.getBean("testBean2", TestBean2.class);
        t2b.sayHello();
        System.out.println(t2b);

        TestBean3 tb3 = ctx.getBean("testBeanNo3", TestBean3.class);
        tb3.tell();

        TestBean3 tb3_1 = ctx.getBean("testBeanNo3_1", TestBean3.class);
        tb3_1.tell();

        TestBean3 tb3_2 = ctx.getBean("getBean3ByAnotherConf", TestBean3.class);
        tb3_2.setName("ONO");
        tb3_2.tell();

        TestBean3 tb3_21 = ctx.getBean("getBean3ByAnotherConf", TestBean3.class);
        tb3_21.tell();

        HelloServiceImpl hsi = ctx.getBean("helloServiceImpl", HelloServiceImpl.class);

        System.out.println("done!");

    }
}
