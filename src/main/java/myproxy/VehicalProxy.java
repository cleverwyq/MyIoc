package myproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class VehicalProxy {
    private IVehical vehical;
    public VehicalProxy(IVehical v) {
        this.vehical = v;
    }

    public class VehicalInvocationHandler implements InvocationHandler {
        private final IVehical v;
        public VehicalInvocationHandler(IVehical v) {
             this.v = v;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args)
                throws Throwable {
            System.out.println("Before invoke....");
            System.out.println("args is :" + args);
            Object ret = method.invoke(v, args);
            System.out.println("After invoke ....");
            return ret;
        }

    }
    public IVehical create() {
        Class<?>[] interfaces = new Class[]{IVehical.class};
        VehicalInvocationHandler handler = new VehicalInvocationHandler(vehical);
        return (IVehical) Proxy.newProxyInstance(vehical.getClass().getClassLoader(),
                interfaces,
                handler);
    }
}
