package annoaop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Aspect
@Component
public class LogHandler {
//    @Before("execution(* MyService.doSomething(..))")
//    public void dataAccess() {
//        System.out.println("Data Acesss now!");
//    }


    @Pointcut(value="execution(* annoaop..MyService2.doSomething(..))")
    public int pointcut() { return 0;}

    @After("pointcut()")
    public int logAfter2() {
        System.out.println("Log after method _2");
        return -1;
    }
    @After("pointcut()")
    public int logAfter1() {
        System.out.println("Log after method _1");
        return -1;
    }


}
