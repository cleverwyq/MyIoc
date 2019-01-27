package javaconfig.p3;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Component
public class TestBean3 {
    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    private String name;

    private int age;
    public void setAge(int age) {
        this.age = age;
    }

    public void setAge2(int age) {
        this.age = age * 2;

    }
    public int getAge() {
        return age;
    }
    public void tell() {
        System.out.println("Hello From TestBean3 ->" + name);
        try {
            PropertyDescriptor pd = new PropertyDescriptor("name", this.getClass());
            Method method = pd.getReadMethod();
            System.out.println("Invoke");
            System.out.println(method.invoke(this));
            for (Annotation a : method.getAnnotations()) {
                System.out.println(a.toString());
            }
            System.out.println(method.getAnnotations());

            PropertyDescriptor pd2 = new PropertyDescriptor("age", this.getClass(), "getAge","setAge2");
            Method method2 = pd2.getWriteMethod();
            method2.invoke(this, 24);
            System.out.println(pd2.getReadMethod().invoke(this));
            System.out.println("modifiers");
            System.out.println(method2.getModifiers());
            System.out.println("root");
            System.out.println(method2);

            System.out.println("Done Invoke");

        }
        catch (Throwable t) {
            System.out.println(t);
        }


    }
}
