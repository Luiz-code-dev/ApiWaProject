package com.ApiManuten.oLaborat.riosExames.WaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.ApiManuten.oLaborat.riosExames.WaProject.service.LaboratorioService")
@EnableJpaRepositories("com.ApiManuten.oLaborat.riosExames.WaProject.repositories.ExamesRepository")
public class WaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaProjectApplication.class, args);
	}

}
