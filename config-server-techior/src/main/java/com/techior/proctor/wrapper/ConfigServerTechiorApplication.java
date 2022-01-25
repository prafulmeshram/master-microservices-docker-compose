package com.techior.proctor.wrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerTechiorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerTechiorApplication.class, args);
	}

}
