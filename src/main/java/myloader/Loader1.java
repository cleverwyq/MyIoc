package myloader;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Loader1 {
    public static void main(String[] args) throws Exception{

        ClassLoader nl = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1)
                                + ".class";
                    InputStream is = this.getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                }
                catch (IOException ex) {
                    throw new ClassNotFoundException(name);
                }
            }
        };

        Object obj = nl.loadClass("myloader.Loader1").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof myloader.Loader1);

        Loader1 l1 = new Loader1();
        ClassLoader cl = l1.getClass().getClassLoader();
        URL url = cl.getResource("myloader/Loader1.class");
        System.out.println(url);

    }
}
