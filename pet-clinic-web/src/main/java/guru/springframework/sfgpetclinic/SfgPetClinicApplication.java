package guru.springframework.sfgpetclinic;

import guru.sfgpetclinic.controllers.MyController;
import guru.sfgpetclinic.controllers.PetController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

        PetController petController = ctx.getBean("petController", PetController.class);
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());


        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("-------- property");
    }
}
