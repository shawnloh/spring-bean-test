package tech.betterwith.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("tech.betterwith")
public class ProjectConfig {

//    @Bean("audi")
//    @Primary
//    Vehicle vehicle() {
//        var vehicle = new Vehicle();
//        vehicle.setName("Audi");
//        return vehicle;
//    }
//
//    @Bean(name = "honda")
//    Vehicle vehicle1() {
//        var vehicle = new Vehicle();
//        vehicle.setName("Honda");
//        return vehicle;
//    }
//
//    @Bean(value = "ferrari")
//    Vehicle vehicle2() {
//        var vehicle = new Vehicle();
//        vehicle.setName("Ferrari");
//        return vehicle;
//    }
}
