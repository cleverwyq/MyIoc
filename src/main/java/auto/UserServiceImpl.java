package auto;

import org.springframework.stereotype.Service;

@Service("UserService2")
public class UserServiceImpl implements UserService {
    @Override
    public void login()
    {
        System.out.println("Login ....");
    }
}
