package a23.climoilou.mono2.formatifs.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"a23.climoilou.mono2.formatifs.controller", "a23.climoilou.mono2.formatifs.model"})
public class Formatif2bApplication {

	public static void main(String[] args) {
		SpringApplication.run(Formatif2bApplication.class, args);
	}

}
