package web.djunqueirao.app_rh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import web.djunqueirao.app_rh.services.ProductService;

@SpringBootApplication
public class JavaSpringApplication {

	@Autowired
	private ProductService exampleService;
	
	public static void main(String[] args) {
		SpringApplication.run(JavaSpringApplication.class, args);
	}
}
