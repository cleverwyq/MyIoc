package tryaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tryaop.service.ShapeService;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("shape.xml");
        ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
//        System.out.println(shapeService.getCircle().getName());
//        System.out.println(shapeService.getTriangle().getName());
//        System.out.println(shapeService.getCircle().getNumber());
//        System.out.println("---1--");
//        shapeService.getCircle().setName("Young");
//        shapeService.getCircle().setInName("dummy");
//        shapeService.getCircle().myDouble(20);
        shapeService.getCircle().use_around();
    }
}
