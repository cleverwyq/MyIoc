package springioc.bean;

import springioc.animal.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Zoo {
//    @Autowired
    private Tiger tiger;

    public Tiger getTiger() {
        return tiger;
    }

    @Autowired
    public void setTiger(Tiger tiger) {
        this.tiger = tiger;
    }

    public Monkey getMonkey() {
        return monkey;
    }
    @Autowired
    public void setMonkey(Monkey monkey) {
        this.monkey = monkey;
    }

    public Monkey getMonkey_son() {
        return monkey_son;
    }
    @Autowired
    public void setMonkey_son(Monkey monkey_son) {
        this.monkey_son = monkey_son;
    }

//        @Autowired
    private Monkey monkey, monkey_son;


    @Resource(name="cat1")
    private Cat cat;





    public String toString() {
        return tiger + "\n" + monkey + " & " + monkey_son + " also "  + cat;
    }
}
