package com.inc.emrys.rojaya;

import com.inc.emrys.rojaya.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class RojayaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RojayaApplication.class, args);



	}

}
