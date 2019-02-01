package lookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class B1 extends B {
    @Override
    public void tell() {
        System.out.println("I am B1 class");
    }
}
