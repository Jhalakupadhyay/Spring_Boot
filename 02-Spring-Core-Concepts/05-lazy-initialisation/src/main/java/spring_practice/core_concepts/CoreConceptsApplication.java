package spring_practice.core_concepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"spring_practice.core_concepts.Controllers", "spring_practice/core_concepts/General"})
public class CoreConceptsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreConceptsApplication.class, args);
	}

}
