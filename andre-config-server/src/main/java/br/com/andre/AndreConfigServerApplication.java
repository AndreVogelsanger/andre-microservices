package br.com.andre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AndreConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndreConfigServerApplication.class, args);
	}

}
