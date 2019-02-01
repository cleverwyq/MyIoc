package LambdaTest;

import java.util.Arrays;
import java.util.List;

public class tryit {
    public static void main(String[] args) {
//        String[] atp = {"tiger", "monkey", "fish"};
//        List<String> players = Arrays.asList(atp);

//        players.forEach((play) -> System.out.println(play));
//        players.forEach(play -> System.out.println(play));
//        players.forEach(System.out::println);

        CallLambda cl = new CallLambda();
        String beanName = "Invoker";
        String lam = cl.callit(beanName, (innerName) -> {
                return beanName + "," + innerName;
        });

        System.out.println(lam);
    }

}
