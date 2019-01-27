package hellojpa;

import java.util.List;

public interface UserService {
    List<User> getUserByName(String name);
}
