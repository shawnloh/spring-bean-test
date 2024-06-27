package tech.betterwith.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.betterwith.beans.Vehicle;
import tech.betterwith.config.ProjectConfig;

public class Example1 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle = context.getBean(Vehicle.class);
//        System.out.println(vehicle.getName());
        vehicle.printHello();
    }
}
