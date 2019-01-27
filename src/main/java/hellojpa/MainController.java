package hellojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(path="/demo")
public class MainController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String name,
                                           @RequestParam String email) {
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path="/testjpa")
    public @ResponseBody Iterable<User> findUserByName(@RequestParam String name) {
        return userService.getUserByName(name);
    }
}
