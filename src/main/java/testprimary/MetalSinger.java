package testprimary;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;

@Component
@Qualifier("msin")
public class MetalSinger implements Singer {
    @Override
    public String Sing(String lyric) {
        String ret = "Hello from Mental ";
        System.out.println(ret + lyric);
        return ret;
    }
}
