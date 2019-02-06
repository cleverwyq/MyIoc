package lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public abstract class A {

    public B getB() {
        return getEntity();
    }

    @Lookup(value="b")
    public abstract  B getEntity();
}
