package dev.local.springboot_test_bench;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ConcurrentHashMap;

@SpringBootApplication
public class SpringbootTestBenchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTestBenchApplication.class, args);
	}
	public static ConcurrentHashMap<String, String> EXCLUDE_INTERCEPTORS = new ConcurrentHashMap<>();

}