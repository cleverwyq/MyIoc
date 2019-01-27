package conditionalTesting;

import conditionalTesting.service.ListService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

public class appMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                ConditionConfig.class
        );
        ListService listService = ctx.getBean(ListService.class);
        String cmd = listService.ShowListCommand();
        System.out.println("Command = " + cmd);
    }
}
