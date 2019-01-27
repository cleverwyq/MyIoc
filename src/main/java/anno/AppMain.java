package anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AppMain {
    @Deprecated
    @Login(password = "Init")
    public void Info() {

    }

    public static void main(String[] args) {
        try {
            Method method = AppMain.class.getMethod("Info");
            boolean ispresent = method.isAnnotationPresent(Login.class);
            if (ispresent) {
                System.out.println("method is annotated");
                Annotation[] anos = method.getAnnotations();
                System.out.println(anos);
                for (Annotation a : anos) {
                    if (a instanceof Login) {
                        String name = ((Login)a).name();
                        String pwd = ((Login)a).password();
                        System.out.println("name is " + name);
                        System.out.println("pwd is " + pwd);
                    }
                }
            }
            else {
                System.out.println("no annotation!!!!");

            }
        }
        catch (Exception e) {

        }
    }
}
