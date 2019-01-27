package testprimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SingerService {

    Singer singer;
    Singer guest;

    @Autowired

    public void init2(@Qualifier("msin") Singer singer, @Qualifier("osin") Singer guest) {
        this.singer = singer;
        this.guest = guest;
    }

    public void Sing() {
        singer.Sing("I love you");
        guest.Sing("I am guest");
    }
}
