package mycg;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);

        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if ("save".equals(method.getName())) {
            System.out.println("o is " + o);
            System.out.println("target is " + target);
            System.out.println("begin transaction");
            Object invoke = method.invoke(target, objects);
            if (invoke != null )
                System.out.println("return from method.invoke :" + invoke.toString());
            System.out.println("Submitted!!");

            return invoke;
        }
        else {
            return method.invoke(target, objects);
        }
    }
}
