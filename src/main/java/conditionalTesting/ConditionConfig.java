package conditionalTesting;


import conditionalTesting.service.LinuxListService;
import conditionalTesting.service.ListService;
import conditionalTesting.service.WindowsListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(conditionalTesting.cond.windows.WindowsCond.class)
    ListService getWindowsListService() {
        System.out.println("conditionalTesting.cond.windows.WindowsCond.class=");
        System.out.println(conditionalTesting.cond.windows.WindowsCond.class);
        return new WindowsListService();
    }

    @Bean
    @Conditional(conditionalTesting.cond.linux.LinuxCond.class)
    ListService getLinuxListSerivce() {
        return new LinuxListService();
    }
}
