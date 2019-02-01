package LambdaTest;

public class CallLambda {
    public String callit(String beanName, AbstractBeanFactory factory) {
        String s = "InnerName";
        return "Hello - " + factory.getObjectby2(s);
    }
}
