package co.edu.usco.pw.spring_bcrypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringBcryptApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBcryptApplication.class, args);
	}

}
