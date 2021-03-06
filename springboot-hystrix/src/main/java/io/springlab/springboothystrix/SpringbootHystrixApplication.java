package io.springlab.springboothystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@EnableHystrixDashboard
@SpringBootApplication
@EnableCircuitBreaker
public class SpringbootHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHystrixApplication.class, args);
	}

}
