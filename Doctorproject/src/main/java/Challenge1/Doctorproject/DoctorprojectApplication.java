package Challenge1.Doctorproject;

import Controller.DoctorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses= DoctorController.class)
public class DoctorprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorprojectApplication.class, args);
	}

}
