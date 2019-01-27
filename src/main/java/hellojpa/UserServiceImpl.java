package hellojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserJpaRepository userJpaRepository;

    public List<User> getUserByName(String name) {
        return userJpaRepository.findAll();
    }
}
