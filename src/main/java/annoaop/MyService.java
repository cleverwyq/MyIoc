package annoaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import annoaop.sub.SubService;

@Component
//@Aspect
public class MyService {

    @Autowired
    private SubService ss;

    public void doSomething() {
        ss.doSomething();
        System.out.println("putting some value into DB..");
    }
}
