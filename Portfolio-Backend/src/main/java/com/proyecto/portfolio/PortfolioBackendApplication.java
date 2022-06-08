package com.proyecto.portfolio;

import java.util.concurrent.Executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableAsync
public class PortfolioBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(PortfolioBackendApplication.class, args);
	}
	@Bean("taskExecutor")
	public Executor getAsyncExecutor(){
		final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(400);
		executor.setMaxPoolSize(4000);
		executor.setQueueCapacity(400);
		executor.setThreadNamePrefix("executor-");
		executor.initialize();
		return executor;
	}
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() { return new BCryptPasswordEncoder();
}
}
