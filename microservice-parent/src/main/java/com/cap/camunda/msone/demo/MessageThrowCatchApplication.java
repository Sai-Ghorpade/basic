package com.cap.camunda.msone.demo;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessageThrowCatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageThrowCatchApplication.class, args);
		
	}
	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseaServer() throws SQLException {
	return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "8083");
	}
}
