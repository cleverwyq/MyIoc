package confwithanno;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Properties;

public class IConfigFactory {
    private Properties properties;
    public IConfigFactory(Properties props) {
        this.properties = props;
    }

    public static class PropertiesInvocationHandler implements InvocationHandler {
        private Properties properties;
        public PropertiesInvocationHandler(Properties pros) {
            this.properties = pros;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args)
                throws Throwable {
            Value v = method.getAnnotation(Value.class);
            String p = properties.getProperty(v.value());
            Class ret = method.getReturnType();
            if (ret.equals(int.class)) {
                int o = Integer.valueOf(p);
                return o;
            }
            return p;
        }
    }
    public static IConfig create(InputStream is) {
        try {
            Properties p = new Properties();
            p.load(is);
            PropertiesInvocationHandler handler = new PropertiesInvocationHandler(p);

            Object ret = Proxy.newProxyInstance(
              IConfig.class.getClassLoader(),
              new Class[] {IConfig.class},
              handler
            );

            return (IConfig)ret;
        }
        catch(Exception e) {
            return null;
        }

    }

    public static void main(String[] args) throws Throwable {
        String file = "src\\main\\resources\\config.txt";

        File f = new File(file);
        System.out.println(f.getAbsolutePath());
        InputStream is = new FileInputStream(file);

        IConfig iconfig = IConfigFactory.create(is);
        System.out.println(iconfig.dbUrl());
        System.out.println(iconfig.poolSize());
    }
}
