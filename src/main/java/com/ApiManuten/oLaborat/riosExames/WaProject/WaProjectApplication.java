package com.ApiManuten.oLaborat.riosExames.WaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan(basePackages = {"com.ApiManuten.oLaborat.riosExames.WaProject.entities"})
@ComponentScan(basePackages = {"com.ApiManuten.oLaborat.riosExames.WaProject.service.ExamesService"})
@EnableJpaRepositories(basePackages = {"com.ApiManuten.oLaborat.riosExames.WaProject.repositories.ExamesRepository"})
@EnableTransactionManagement
@EnableWebMvc
@RestController
@EnableAutoConfiguration
public class WaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaProjectApplication.class, args);
	}

}
