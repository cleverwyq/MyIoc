package lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public abstract class A {
//    private B b;


    public B getB() {
        return getEntity();
    }

    @Lookup(value="b")
    public abstract  B getEntity();
}
