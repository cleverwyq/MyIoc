package cg;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao{
    public String add(int i) {
        return "Got3 " + 2 * i;
    }
}
