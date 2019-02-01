package tryinitabstract;

import org.springframework.stereotype.Component;


public class ConcretClass extends AbstractClass {
    @Override
    public void doNothing() {
        System.out.println("Concrete class doNothing");
    }
}
