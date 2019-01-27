package cg;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogHander {

    @Pointcut("execution(* add(..))")
    public void pointcut(){}

    @Before(value="pointcut()")
    public void beforeInvoke() {
        System.out.println("before exec2222");
    }
}
