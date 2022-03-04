package com.ApiManuten.oLaborat.riosExames.WaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = {"com.ApiManuten.oLaborat.riosExames.WaProject.entities"})
@ComponentScan(basePackages = {"com.ApiManuten.oLaborat.riosExames.WaProject.service.ExamesService"})
@EnableJpaRepositories(basePackages = {"com.ApiManuten.oLaborat.riosExames.WaProject.repositories.ExamesRepository"})
@EnableTransactionManagement
public class WaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaProjectApplication.class, args);
	}

}
