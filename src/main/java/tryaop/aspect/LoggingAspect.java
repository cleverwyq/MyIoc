package tryaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

//    @Before("execution(public * get*())")
//    public void LoggingAdvice(){
//        System.out.println("Advice run. Get Method called");
//    }
//
//    @Before("allGetters()")
//    public void SecondAdvice() {
//        System.out.println("Second advice");
//    }

//    @Before("allCircleMethods()")
//    public void allMethodsAdvice(JoinPoint joinPoint) {
//        System.out.println("one by one");
//        System.out.println(joinPoint.toString());
//    }
//    @Pointcut("execution(* get*())")
//    public void allGetters(){}
//
//    @Pointcut("within(tryaop.model.Circle)")
//    public void allCircleMethods(){}
//
//    @Before("args(name2)")
//    public void methodwithName(String name2) {
//        System.out.println("the method name value is " + name2);
//    }

    @AfterReturning(pointcut="execution(* tryaop.model.Circle.setInName(..))", returning="name222")
    public void getorelse_returningType_advice(String name222) {
        System.out.println("returned type:" + name222);
    }

    @AfterReturning(pointcut="args(num)", returning="ret")
    public void getorelse_returningType_advice(int num, int ret) {
        System.out.println("returned type:" + ret + "input :" + num);
    }

    @Around("@annotation(tryaop.annotation.Logable)")
    public void AroundAdvice(ProceedingJoinPoint pjp) {
        try {
            System.out.println("before exec");
            pjp.proceed();
            System.out.println("after exec");
        }
        catch(Throwable ex) {

        }
    }
}
