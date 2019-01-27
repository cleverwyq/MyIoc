package testprimary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;

@Component
@Qualifier("osin")
public class OperaSinger implements Singer {
    @Override
    public String Sing(String lyric) {
        String ret = "Hello From OperaSinger ";
        System.out.println(ret + lyric);
        return ret;
    }
}
