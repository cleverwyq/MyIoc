package annoaop.sub;

import org.springframework.stereotype.Component;

@Component
public class SubService {
    public void doSomething() {
        System.out.println("Sub service do!");
    }
}
