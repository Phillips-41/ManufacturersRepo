package com.MakerSharks.ManufactureApi;

import com.MakerSharks.ManufactureApi.role.Role;
import com.MakerSharks.ManufactureApi.role.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;


@EnableAsync
@SpringBootApplication
public class ManufactureApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManufactureApiApplication.class, args);
	}
	public CommandLineRunner runner(RoleRepository roleRepository) {
		return args -> {
			if (roleRepository.findByName("USER").isEmpty()) {
				roleRepository.save(Role.builder().name("USER").build());
			}
		};
	}

}
